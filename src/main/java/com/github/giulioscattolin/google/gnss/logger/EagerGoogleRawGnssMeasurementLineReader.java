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

    protected static class Read {
        MutableGoogleRawGnssMeasurement itsGoogleRawGnssMeasurement = new MutableGoogleRawGnssMeasurement();
        String[] itsFields;

        Read(String line) {
            itsFields = line.split(",");
            read();
        }

        protected void read() {
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

        protected void readUtcTimeMillis() {
            trySupplyLongAt(1, itsGoogleRawGnssMeasurement::setUtcTimeMillis);
        }

        protected void readTimeNanos() {
            trySupplyLongAt(2, itsGoogleRawGnssMeasurement::setTimeNanos);
        }

        protected void readLeapSecond() {
            trySupplyIntegerAt(3, itsGoogleRawGnssMeasurement::setLeapSecond);
        }

        protected void readTimeUncertaintyNanos() {
            trySupplyDoubleAt(4, itsGoogleRawGnssMeasurement::setTimeUncertaintyNanos);
        }

        protected void readFullBiasNanos() {
            trySupplyLongAt(5, itsGoogleRawGnssMeasurement::setFullBiasNanos);
        }

        protected void readBiasNanos() {
            trySupplyDoubleAt(6, itsGoogleRawGnssMeasurement::setBiasNanos);
        }

        protected void readBiasUncertaintyNanos() {
            trySupplyDoubleAt(7, itsGoogleRawGnssMeasurement::setBiasUncertaintyNanos);
        }

        protected void readDriftNanosPerSecond() {
            trySupplyDoubleAt(8, itsGoogleRawGnssMeasurement::setDriftNanosPerSecond);
        }

        protected void readDriftUncertaintyNanosPerSecond() {
            trySupplyDoubleAt(9, itsGoogleRawGnssMeasurement::setDriftUncertaintyNanosPerSecond);
        }

        protected void readHardwareClockDiscontinuityCount() {
            trySupplyIntegerAt(10, itsGoogleRawGnssMeasurement::setHardwareClockDiscontinuityCount);
        }

        protected void readSvid() {
            trySupplyIntegerAt(11, itsGoogleRawGnssMeasurement::setSvid);
        }

        protected void readTimeOffsetNanos() {
            trySupplyDoubleAt(12, itsGoogleRawGnssMeasurement::setTimeOffsetNanos);
        }

        protected void readState() {
            trySupplyIntegerAt(13, itsGoogleRawGnssMeasurement::setState);
        }

        protected void readReceivedSvTimeNanos() {
            trySupplyLongAt(14, itsGoogleRawGnssMeasurement::setReceivedSvTimeNanos);
        }

        protected void readReceivedSvTimeUncertaintyNanos() {
            trySupplyLongAt(15, itsGoogleRawGnssMeasurement::setReceivedSvTimeUncertaintyNanos);
        }

        protected void readCn0DbHz() {
            trySupplyDoubleAt(16, itsGoogleRawGnssMeasurement::setCn0DbHz);
        }

        protected void readPseudorangeRateMetersPerSecond() {
            trySupplyDoubleAt(17, itsGoogleRawGnssMeasurement::setPseudorangeRateMetersPerSecond);
        }

        protected void readPseudorangeRateUncertaintyMetersPerSecond() {
            trySupplyDoubleAt(18, itsGoogleRawGnssMeasurement::setPseudorangeRateUncertaintyMetersPerSecond);
        }

        protected void readAccumulatedDeltaRangeState() {
            trySupplyIntegerAt(19, itsGoogleRawGnssMeasurement::setAccumulatedDeltaRangeState);
        }

        protected void readAccumulatedDeltaRangeMeters() {
            trySupplyDoubleAt(20, itsGoogleRawGnssMeasurement::setAccumulatedDeltaRangeMeters);
        }

        protected void readAccumulatedDeltaRangeUncertaintyMeters() {
            trySupplyDoubleAt(21, itsGoogleRawGnssMeasurement::setAccumulatedDeltaRangeUncertaintyMeters);
        }

        protected void readCarrierFrequencyHz() {
            trySupplyDoubleAt(22, itsGoogleRawGnssMeasurement::setCarrierFrequencyHz);
        }

        protected void readCarrierCycles() {
            trySupplyLongAt(23, itsGoogleRawGnssMeasurement::setCarrierCycles);
        }

        protected void readCarrierPhase() {
            trySupplyDoubleAt(24, itsGoogleRawGnssMeasurement::setCarrierPhase);
        }

        protected void readCarrierPhaseUncertainty() {
            trySupplyDoubleAt(25, itsGoogleRawGnssMeasurement::setCarrierPhaseUncertainty);
        }

        protected void readMultipathIndicator() {
            trySupplyIntegerAt(26, itsGoogleRawGnssMeasurement::setMultipathIndicator);
        }

        protected void readSnrInDb() {
            trySupplyDoubleAt(27, itsGoogleRawGnssMeasurement::setSnrInDb);
        }

        protected void readConstellationType() {
            trySupplyIntegerAt(28, itsGoogleRawGnssMeasurement::setConstellationType);
        }

        protected void readAgcDb() {
            trySupplyDoubleAt(29, itsGoogleRawGnssMeasurement::setAgcDb);
        }

        protected void readBasebandCn0DbHz() {
            trySupplyDoubleAt(30, itsGoogleRawGnssMeasurement::setBasebandCn0DbHz);
        }

        protected void readFullInterSignalBiasNanos() {
            trySupplyDoubleAt(31, itsGoogleRawGnssMeasurement::setFullInterSignalBiasNanos);
        }

        protected void readFullInterSignalBiasUncertaintyNanos() {
            trySupplyDoubleAt(32, itsGoogleRawGnssMeasurement::setFullInterSignalBiasUncertaintyNanos);
        }

        protected void readSatelliteInterSignalBiasNanos() {
            trySupplyDoubleAt(33, itsGoogleRawGnssMeasurement::setSatelliteInterSignalBiasNanos);
        }

        protected void readSatelliteInterSignalBiasUncertaintyNanos() {
            trySupplyDoubleAt(34, itsGoogleRawGnssMeasurement::setSatelliteInterSignalBiasUncertaintyNanos);
        }

        protected void readCodeType() {
            trySupplyStringAt(35, itsGoogleRawGnssMeasurement::setCodeType);
        }

        protected void readChipsetElapsedRealtimeNanos() {
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
