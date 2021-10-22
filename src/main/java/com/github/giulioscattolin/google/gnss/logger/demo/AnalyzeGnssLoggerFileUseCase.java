package com.github.giulioscattolin.google.gnss.logger.demo;

import com.github.giulioscattolin.google.gnss.logger.*;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.*;

import static java.lang.Math.abs;

/**
 * A multi-purpose use-case that read a GNSS Logger file and present some statistics.
 */
public class AnalyzeGnssLoggerFileUseCase implements GoogleGnssLoggerRecordCollector, GoogleGnssLoggerRecordVisitor {
    private static final DecimalFormat itsFormatter = new DecimalFormat("0.####E0");
    private final File itsFile;
    private final Presenter itsPresenter;
    private final EagerGoogleRawGnssMeasurementLineReader itsReader = new EagerGoogleRawGnssMeasurementLineReader(this);
    private int itsGoogleRawGnssMeasurementCount = 0;
    private Map<ConstellationTypeCarrierFrequency, List<GoogleRawGnssMeasurement>> itsGoogleRawGnssMeasurementByConstellationTypeAndCarrierFrequency = new HashMap<>();

    public AnalyzeGnssLoggerFileUseCase(File file, Presenter presenter) {
        itsFile = file;
        itsPresenter = presenter;
    }

    public void execute() {
        if (isFileValid()) {
            read();
            report();
        }
    }

    private boolean isFileValid() {
        if (!itsFile.isFile()) {
            itsPresenter.tellError("File " + itsFile + " is not a file");
            return false;
        }
        if (!itsFile.canRead()) {
            itsPresenter.tellError("File " + itsFile + " is not readable");
            return false;
        }
        return true;
    }

    private void read() {
        try {
            tryRead();
        } catch (Exception exception) {
            itsPresenter.tellError(exception.toString());
        }
    }

    private void tryRead() throws IOException {
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(itsFile))) {
            read(bufferedReader);
        }
    }

    private void read(BufferedReader bufferedReader) throws IOException {
        String line;
        while ((line = bufferedReader.readLine()) != null)
            process(line);
    }

    private void process(String line) {
        itsReader.readLine(line);
    }

    public void collect(GoogleGnssLoggerRecord record) {
        record.accept(this);
    }

    public void visit(GoogleRawGnssMeasurement googleRawGnssMeasurement) {
        incrementGoogleRawGnssMeasurementCount();
        accumulateByConstellationTypeAndCarrierFrequency(googleRawGnssMeasurement);
    }

    private void accumulateByConstellationTypeAndCarrierFrequency(GoogleRawGnssMeasurement googleRawGnssMeasurement) {
        if (googleRawGnssMeasurement.hasConstellationType() && googleRawGnssMeasurement.hasCarrierFrequencyHz()) {
            ConstellationTypeCarrierFrequency constellationTypeAndCarrierFrequency = new ConstellationTypeCarrierFrequency();
            constellationTypeAndCarrierFrequency.itsConstellationType = googleRawGnssMeasurement.getConstellationType();
            constellationTypeAndCarrierFrequency.itsCarrierFrequencyHz = googleRawGnssMeasurement.getCarrierFrequencyHz();
            itsGoogleRawGnssMeasurementByConstellationTypeAndCarrierFrequency
                .computeIfAbsent(constellationTypeAndCarrierFrequency, ignored -> new LinkedList<>())
                .add(googleRawGnssMeasurement);
        }
    }

    private void incrementGoogleRawGnssMeasurementCount() {
        itsGoogleRawGnssMeasurementCount++;
    }

    private void report() {
        tellGoogleRawGnssMeasurementCount();
        tellGoogleRawGnssMeasurementParametersByConstellationAndCarrierFrequency();
    }

    private void tellGoogleRawGnssMeasurementCount() {
        itsPresenter.tellGoogleRawGnssMeasurementCount(itsGoogleRawGnssMeasurementCount);
    }

    private void tellGoogleRawGnssMeasurementParametersByConstellationAndCarrierFrequency() {
        itsPresenter.beforeReportByConstellationAndCarrierFrequency();
        for (Map.Entry<ConstellationTypeCarrierFrequency, List<GoogleRawGnssMeasurement>> entry : itsGoogleRawGnssMeasurementByConstellationTypeAndCarrierFrequency.entrySet())
            itsPresenter.tellReport(makeReport(entry.getKey(), entry.getValue()));
    }

    private Presenter.ReportByConstellationTypeCarrierFrequency makeReport(ConstellationTypeCarrierFrequency key, List<GoogleRawGnssMeasurement> googleRawGnssMeasurements) {
        Presenter.ReportByConstellationTypeCarrierFrequency report = new Presenter.ReportByConstellationTypeCarrierFrequency();
        report.itsConstellation = getConstellationName(key.itsConstellationType);
        report.itsCarrier = getCarrier(key.itsCarrierFrequencyHz, report.itsConstellation);
        report.itsCount = googleRawGnssMeasurements.size();
        report.itsAverageCn0DbHz = getAverageCn0DbHz(googleRawGnssMeasurements);
        return report;
    }

    private String getCarrier(double carrierFrequencyHz, String constellation) {
        if ("GLONASS".equals(constellation))
            return itsFormatter.format(carrierFrequencyHz);
        if (isCloseTo(carrierFrequencyHz, 1176.45E6)) {
            if ("GPS".equals(constellation) || "IRNSS".equals(constellation))
                return "L5";
            if ("GALILEO".equals(constellation))
                return "E5a";
            if ("BEIDOU".equals(constellation))
                return "B2a";
            return "1176.45E6";
        }
        if (isCloseTo(carrierFrequencyHz, 1575.42E6)) {
            if ("GPS".equals(constellation) || "IRNSS".equals(constellation))
                return "L1";
            if ("GALILEO".equals(constellation))
                return "E1";
            if ("BEIDOU".equals(constellation))
                return "B1c";
            return "1176.45E6";
        }
        if (isCloseTo(carrierFrequencyHz, 1.5611E9))
            if ("BEIDOU".equals(constellation))
                return "B1I";
        return itsFormatter.format(carrierFrequencyHz);
    }

    private boolean isCloseTo(double actual, double expected) {
        return abs(actual - expected) < 1E6;
    }

    private String getConstellationName(int constellationType) {
        switch (constellationType) {
            case 5:
                return "BEIDOU";
            case 6:
                return "GALILEO";
            case 3:
                return "GLONASS";
            case 1:
                return "GPS";
            case 7:
                return "IRNSS";
            case 4:
                return "QZSS";
            case 2:
                return "SBAS";
            case 0:
                return "UNKNOWN";
            default:
                return "???";
        }
    }

    private double getAverageCn0DbHz(List<GoogleRawGnssMeasurement> googleRawGnssMeasurements) {
        double cumulativeCn0DbHz = 0;
        for (GoogleRawGnssMeasurement googleRawGnssMeasurement : googleRawGnssMeasurements)
            if (googleRawGnssMeasurement.hasCn0DbHz())
                cumulativeCn0DbHz += googleRawGnssMeasurement.getCn0DbHz();
        return cumulativeCn0DbHz / googleRawGnssMeasurements.size();
    }

    /**
     * Abstraction for the {@link AnalyzeGnssLoggerFileUseCase} presenter.
     */
    public interface Presenter {
        void tellError(String error);

        void tellGoogleRawGnssMeasurementCount(int googleRawGnssMeasurementCount);

        void tellReport(ReportByConstellationTypeCarrierFrequency report);

        void beforeReportByConstellationAndCarrierFrequency();

        /**
         * Holds some statistics for a given (constellation, carrier frequency) pair.
         */
        class ReportByConstellationTypeCarrierFrequency {
            public String itsConstellation;
            public String itsCarrier;
            public int itsCount;
            public double itsAverageCn0DbHz;
        }
    }

    static class ConstellationTypeCarrierFrequency {
        int itsConstellationType;
        double itsCarrierFrequencyHz;

        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            ConstellationTypeCarrierFrequency that = (ConstellationTypeCarrierFrequency) o;
            return itsConstellationType == that.itsConstellationType && Double.compare(that.itsCarrierFrequencyHz, itsCarrierFrequencyHz) == 0;
        }

        public int hashCode() {
            return Objects.hash(itsConstellationType, itsCarrierFrequencyHz);
        }
    }
}
