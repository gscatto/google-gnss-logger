package com.github.giulioscattolin.google.gnss.logger.demo;

import java.io.File;

import static java.lang.String.format;
import static java.lang.String.valueOf;

public class AnalyzeGnssLoggerFileDemo {
    public static void main(String[] args) {
        String filePath = args[0];
        File file = new File(filePath);
        new AnalyzeGnssLoggerFileUseCase(file, new PresenterImpl()).execute();
    }

    private static class PresenterImpl implements AnalyzeGnssLoggerFileUseCase.Presenter {
        final String CONSTELLATION_HEADER = "Constellation";
        final String CARRIER_FREQUENCY_HEADER = "Carrier [Hz]";
        final String COUNT_HEADER = "Count";
        final String AVERAGE_CN0DBHZ_HEADER = "Avg.Cn0DbHz";
        final int CONSTELLATION_COLUMN_WIDTH = CONSTELLATION_HEADER.length();
        final int CARRIER_FREQUENCY_COLUMN_WIDTH = 2 + CARRIER_FREQUENCY_HEADER.length();
        final int COUNT_COLUMN_WIDTH = 6 + COUNT_HEADER.length();
        final int AVERAGE_CN0DBHZ_HEADER_COLUMN_WIDTH = 4 + AVERAGE_CN0DBHZ_HEADER.length();

        private static String fixedLength(String text, int length) {
            return format("%1$" + length + "s", text);
        }

        public void tellError(String error) {
            System.err.println(error);
        }

        public void tellGoogleRawGnssMeasurementCount(int googleRawGnssMeasurementCount) {
            System.out.println("GoogleRawGnssMeasurementCount = "+googleRawGnssMeasurementCount);
        }

        public void beforeReportByConstellationAndCarrierFrequency() {
            System.out.println("" +
                fixedLength(CONSTELLATION_HEADER, CONSTELLATION_COLUMN_WIDTH) +
                fixedLength(CARRIER_FREQUENCY_HEADER, CARRIER_FREQUENCY_COLUMN_WIDTH) +
                fixedLength(COUNT_HEADER, COUNT_COLUMN_WIDTH) +
                fixedLength(AVERAGE_CN0DBHZ_HEADER, AVERAGE_CN0DBHZ_HEADER_COLUMN_WIDTH)
            );
        }

        public void tellReport(ReportByConstellationTypeCarrierFrequency report) {
            System.out.println("" +
                fixedLength(report.itsConstellation, CONSTELLATION_COLUMN_WIDTH) +
                fixedLength(report.itsCarrier, CARRIER_FREQUENCY_COLUMN_WIDTH) +
                fixedLength(valueOf(report.itsCount), COUNT_COLUMN_WIDTH) +
                fixedLength(format("%.2f", report.itsAverageCn0DbHz), AVERAGE_CN0DBHZ_HEADER_COLUMN_WIDTH)
            );
        }
    }
}
