package com.github.giulioscattolin.google.gnss.logger;

import java.util.function.Consumer;

import static java.lang.Double.parseDouble;
import static java.lang.Integer.parseInt;
import static java.lang.Long.parseLong;

/**
 * A {@link GoogleRawGnssMeasurementLineReader} that reads all the fields at once.
 */
public class EagerGoogleRawGnssMeasurementLineReader extends GoogleRawGnssMeasurementLineReader {
    private final GoogleGnssLoggerRecordCollector itsCollector;

    public EagerGoogleRawGnssMeasurementLineReader(GoogleGnssLoggerRecordCollector collector) {
        itsCollector = collector;
    }

    public void readGoogleRawGnssMeasurement(String line) {
        itsCollector.collect(new Read(line).itsGoogleRawGnssMeasurement);
    }

    static class Read {
        MutableGoogleRawGnssMeasurement itsGoogleRawGnssMeasurement = new MutableGoogleRawGnssMeasurement();
        String[] itsFields;

        Read(String line) {
            itsFields = line.split(",");
            read();
        }

        private void read() {
            readUtcTimeMillis();
            readTimeNanos();
            readLeapSecond();
            readTimeUncertaintyNanos();
            readFullBiasNanos();
            readBiasNanos();
            readBiasUncertaintyNanos();
            readDriftNanosPerSecond();
            readDriftUncertaintyNanosPerSecond();
            readHardwareClockDiscontinuityCount();
            readSvid();
            readTimeOffsetNanos();
            readState();
            readReceivedSvTimeNanos();
            readReceivedSvTimeUncertaintyNanos();
            readCn0DbHz();
            readPseudorangeRateMetersPerSecond();
            readPseudorangeRateUncertaintyMetersPerSecond();
            readAccumulatedDeltaRangeState();
            readAccumulatedDeltaRangeMeters();
            readAccumulatedDeltaRangeUncertaintyMeters();
            readCarrierFrequencyHz();
            readCarrierCycles();
            readCarrierPhase();
            readCarrierPhaseUncertainty();
            readMultipathIndicator();
            readSnrInDb();
            readConstellationType();
            readAgcDb();
            readBasebandCn0DbHz();
            readFullInterSignalBiasNanos();
            readFullInterSignalBiasUncertaintyNanos();
            readSatelliteInterSignalBiasNanos();
            readSatelliteInterSignalBiasUncertaintyNanos();
            readCodeType();
            readChipsetElapsedRealtimeNanos();
        }

        private void readUtcTimeMillis() {
            trySupplyLongAt(1, itsGoogleRawGnssMeasurement::setUtcTimeMillis);
        }

        private void readTimeNanos() {
            trySupplyLongAt(2, itsGoogleRawGnssMeasurement::setTimeNanos);
        }

        private void readLeapSecond() {
            trySupplyIntegerAt(3, itsGoogleRawGnssMeasurement::setLeapSecond);
        }

        private void readTimeUncertaintyNanos() {
            trySupplyDoubleAt(4, itsGoogleRawGnssMeasurement::setTimeUncertaintyNanos);
        }

        private void readFullBiasNanos() {
            trySupplyLongAt(5, itsGoogleRawGnssMeasurement::setFullBiasNanos);
        }

        private void readBiasNanos() {
            trySupplyDoubleAt(6, itsGoogleRawGnssMeasurement::setBiasNanos);
        }

        private void readBiasUncertaintyNanos() {
            trySupplyDoubleAt(7, itsGoogleRawGnssMeasurement::setBiasUncertaintyNanos);
        }

        private void readDriftNanosPerSecond() {
            trySupplyDoubleAt(8, itsGoogleRawGnssMeasurement::setDriftNanosPerSecond);
        }

        private void readDriftUncertaintyNanosPerSecond() {
            trySupplyDoubleAt(9, itsGoogleRawGnssMeasurement::setDriftUncertaintyNanosPerSecond);
        }

        private void readHardwareClockDiscontinuityCount() {
            trySupplyIntegerAt(10, itsGoogleRawGnssMeasurement::setHardwareClockDiscontinuityCount);
        }

        private void readSvid() {
            trySupplyIntegerAt(11, itsGoogleRawGnssMeasurement::setSvid);
        }

        private void readTimeOffsetNanos() {
            trySupplyDoubleAt(12, itsGoogleRawGnssMeasurement::setTimeOffsetNanos);
        }

        private void readState() {
            trySupplyIntegerAt(13, itsGoogleRawGnssMeasurement::setState);
        }

        private void readReceivedSvTimeNanos() {
            trySupplyLongAt(14, itsGoogleRawGnssMeasurement::setReceivedSvTimeNanos);
        }

        private void readReceivedSvTimeUncertaintyNanos() {
            trySupplyLongAt(15, itsGoogleRawGnssMeasurement::setReceivedSvTimeUncertaintyNanos);
        }

        private void readCn0DbHz() {
            trySupplyDoubleAt(16, itsGoogleRawGnssMeasurement::setCn0DbHz);
        }

        private void readPseudorangeRateMetersPerSecond() {
            trySupplyDoubleAt(17, itsGoogleRawGnssMeasurement::setPseudorangeRateMetersPerSecond);
        }

        private void readPseudorangeRateUncertaintyMetersPerSecond() {
            trySupplyDoubleAt(18, itsGoogleRawGnssMeasurement::setPseudorangeRateUncertaintyMetersPerSecond);
        }

        private void readAccumulatedDeltaRangeState() {
            trySupplyIntegerAt(19, itsGoogleRawGnssMeasurement::setAccumulatedDeltaRangeState);
        }

        private void readAccumulatedDeltaRangeMeters() {
            trySupplyDoubleAt(20, itsGoogleRawGnssMeasurement::setAccumulatedDeltaRangeMeters);
        }

        private void readAccumulatedDeltaRangeUncertaintyMeters() {
            trySupplyDoubleAt(21, itsGoogleRawGnssMeasurement::setAccumulatedDeltaRangeUncertaintyMeters);
        }

        private void readCarrierFrequencyHz() {
            trySupplyDoubleAt(22, itsGoogleRawGnssMeasurement::setCarrierFrequencyHz);
        }

        private void readCarrierCycles() {
            trySupplyLongAt(23, itsGoogleRawGnssMeasurement::setCarrierCycles);
        }

        private void readCarrierPhase() {
            trySupplyDoubleAt(24, itsGoogleRawGnssMeasurement::setCarrierPhase);
        }

        private void readCarrierPhaseUncertainty() {
            trySupplyDoubleAt(25, itsGoogleRawGnssMeasurement::setCarrierPhaseUncertainty);
        }

        private void readMultipathIndicator() {
            trySupplyIntegerAt(26, itsGoogleRawGnssMeasurement::setMultipathIndicator);
        }

        private void readSnrInDb() {
            trySupplyDoubleAt(27, itsGoogleRawGnssMeasurement::setSnrInDb);
        }

        private void readConstellationType() {
            trySupplyIntegerAt(28, itsGoogleRawGnssMeasurement::setConstellationType);
        }

        private void readAgcDb() {
            trySupplyDoubleAt(29, itsGoogleRawGnssMeasurement::setAgcDb);
        }

        private void readBasebandCn0DbHz() {
            trySupplyDoubleAt(30, itsGoogleRawGnssMeasurement::setBasebandCn0DbHz);
        }

        private void readFullInterSignalBiasNanos() {
            trySupplyDoubleAt(31, itsGoogleRawGnssMeasurement::setFullInterSignalBiasNanos);
        }

        private void readFullInterSignalBiasUncertaintyNanos() {
            trySupplyDoubleAt(32, itsGoogleRawGnssMeasurement::setFullInterSignalBiasUncertaintyNanos);
        }

        private void readSatelliteInterSignalBiasNanos() {
            trySupplyDoubleAt(33, itsGoogleRawGnssMeasurement::setSatelliteInterSignalBiasNanos);
        }

        private void readSatelliteInterSignalBiasUncertaintyNanos() {
            trySupplyDoubleAt(34, itsGoogleRawGnssMeasurement::setSatelliteInterSignalBiasUncertaintyNanos);
        }

        private void readCodeType() {
            trySupplyStringAt(35, itsGoogleRawGnssMeasurement::setCodeType);
        }

        private void readChipsetElapsedRealtimeNanos() {
            trySupplyLongAt(36, itsGoogleRawGnssMeasurement::setChipsetElapsedRealtimeNanos);
        }

        private void trySupplyLongAt(int index, Consumer<Long> consumer) {
            if (isFieldNonEmpty(index))
                supplyLongAt(index, consumer);
        }

        private void supplyLongAt(int index, Consumer<Long> consumer) {
            try {
                consumer.accept(getLongAt(index));
            } catch (Exception ignored) {
            }
        }

        private void trySupplyIntegerAt(int index, Consumer<Integer> consumer) {
            if (isFieldNonEmpty(index))
                supplyIntegerAt(index, consumer);
        }

        private void supplyIntegerAt(int index, Consumer<Integer> consumer) {
            try {
                consumer.accept(getIntegerAt(index));
            } catch (Exception ignored) {
            }
        }

        private void trySupplyDoubleAt(int index, Consumer<Double> consumer) {
            if (isFieldNonEmpty(index))
                supplyDoubleAt(index, consumer);
        }

        private void supplyDoubleAt(int index, Consumer<Double> consumer) {
            try {
                consumer.accept(getDoubleAt(index));
            } catch (Exception ignored) {
            }
        }

        private void trySupplyStringAt(int index, Consumer<String> consumer) {
            if (isFieldNonEmpty(index))
                supplyStringAt(index, consumer);
        }

        private void supplyStringAt(int index, Consumer<String> consumer) {
            consumer.accept(getFieldAt(index));
        }

        private long getLongAt(int index) {
            return parseLong(getFieldAt(index));
        }

        private int getIntegerAt(int index) {
            return parseInt(getFieldAt(index));
        }

        private double getDoubleAt(int index) {
            return parseDouble(getFieldAt(index));
        }

        private boolean isFieldNonEmpty(int index) {
            return !getFieldAt(index).isEmpty();
        }

        private String getFieldAt(int index) {
            if (index < itsFields.length)
                return itsFields[index];
            else
                return "";
        }
    }
}
