package com.github.giulioscattolin;

import static java.lang.Double.parseDouble;
import static java.lang.Integer.parseInt;
import static java.lang.Long.parseLong;

class EagerGoogleRawGnssMeasurementLineAdapter extends GoogleRawGnssMeasurement {
    private String[] itsFields;
    private Long itsUtcTimeMillis;
    private Long itsTimeNanos;
    private Integer itsConstellationType;
    private Integer itsMultipathIndicator;
    private Integer itsLeapSecond;
    private Double itsTimeUncertaintyNanos;
    private Long itsFullBiasNanos;
    private Double itsBiasNanos;
    private Double itsBiasUncertaintyNanos;
    private Double itsDriftNanosPerSecond;
    private Double itsDriftUncertaintyNanosPerSecond;
    private Integer itsHardwareClockDiscontinuityCount;
    private Integer itsSvid;
    private Double itsTimeOffsetNanos;
    private Integer itsState;
    private Long itsReceivedSvTimeNanos;
    private Long itsReceivedSvTimeUncertaintyNanos;
    private Double itsCn0DbHz;
    private Double itsPseudorangeRateMetersPerSecond;
    private Double itsPseudorangeRateUncertaintyMetersPerSecond;
    private Integer itsAccumulatedDeltaRangeState;
    private Double itsAccumulatedDeltaRangeMeters;
    private Double itsAccumulatedDeltaRangeUncertaintyMeters;
    private Double itsCarrierFrequencyHz;
    private Long itsCarrierCycles;
    private Double itsCarrierPhase;
    private Double itsCarrierPhaseUncertainty;
    private Double itsSnrInDb;
    private Double itsAgcDb;
    private Double itsBasebandCn0DbHz;
    private Double itsFullInterSignalBiasNanos;
    private Double itsFullInterSignalBiasUncertaintyNanos;
    private Double itsSatelliteInterSignalBiasNanos;
    private Double itsSatelliteInterSignalBiasUncertaintyNanos;
    private String itsCodeType;
    private Long itsChipsetElapsedRealtimeNanos;

    EagerGoogleRawGnssMeasurementLineAdapter(String line) {
        itsFields = line.split(",");
        read();
        itsFields = null;
    }

    static void readLine(String line, GoogleGnssLoggerRecordCollector collector) {
        if (line.startsWith("Raw"))
            collector.collect(new EagerGoogleRawGnssMeasurementLineAdapter(line));
    }

    private void read() {
        itsUtcTimeMillis = getLongAt(1);
        itsTimeNanos = getLongAt(2);
        itsLeapSecond = getIntegerAt(3);
        itsTimeUncertaintyNanos = getDoubleAt(4);
        itsFullBiasNanos = getLongAt(5);
        itsBiasNanos = getDoubleAt(6);
        itsBiasUncertaintyNanos = getDoubleAt(7);
        itsDriftNanosPerSecond = getDoubleAt(8);
        itsDriftUncertaintyNanosPerSecond = getDoubleAt(9);
        itsHardwareClockDiscontinuityCount = getIntegerAt(10);
        itsSvid = getIntegerAt(11);
        itsTimeOffsetNanos = getDoubleAt(12);
        itsState = getIntegerAt(13);
        itsReceivedSvTimeNanos = getLongAt(14);
        itsReceivedSvTimeUncertaintyNanos = getLongAt(15);
        itsCn0DbHz = getDoubleAt(16);
        itsPseudorangeRateMetersPerSecond = getDoubleAt(17);
        itsPseudorangeRateUncertaintyMetersPerSecond = getDoubleAt(18);
        itsAccumulatedDeltaRangeState = getIntegerAt(19);
        itsAccumulatedDeltaRangeMeters = getDoubleAt(20);
        itsAccumulatedDeltaRangeUncertaintyMeters = getDoubleAt(21);
        itsCarrierFrequencyHz = getDoubleAt(22);
        itsCarrierCycles = getLongAt(23);
        itsCarrierPhase = getDoubleAt(24);
        itsCarrierPhaseUncertainty = getDoubleAt(25);
        itsMultipathIndicator = getIntegerAt(26);
        itsSnrInDb = getDoubleAt(27);
        itsConstellationType = getIntegerAt(28);
        itsAgcDb = getDoubleAt(29);
        itsBasebandCn0DbHz = getDoubleAt(30);
        itsFullInterSignalBiasNanos = getDoubleAt(31);
        itsFullInterSignalBiasUncertaintyNanos = getDoubleAt(32);
        itsSatelliteInterSignalBiasNanos = getDoubleAt(33);
        itsSatelliteInterSignalBiasUncertaintyNanos = getDoubleAt(34);
        itsCodeType = getStringAt(35);
        itsChipsetElapsedRealtimeNanos = getLongAt(36);
    }

    public boolean hasUtcTimeMillis() {
        return itsUtcTimeMillis != null;
    }

    public long getUtcTimeMillis() {
        return itsUtcTimeMillis;
    }

    public boolean hasTimeNanos() {
        return itsTimeNanos != null;
    }

    public long getTimeNanos() {
        return itsTimeNanos;
    }

    public boolean hasLeapSecond() {
        return itsLeapSecond != null;
    }

    public int getLeapSecond() {
        return itsLeapSecond;
    }

    public boolean hasTimeUncertaintyNanos() {
        return itsTimeUncertaintyNanos != null;
    }

    public double getTimeUncertaintyNanos() {
        return itsTimeUncertaintyNanos;
    }

    public boolean hasFullBiasNanos() {
        return itsFullBiasNanos != null;
    }

    public long getFullBiasNanos() {
        return itsFullBiasNanos;
    }

    public boolean hasBiasNanos() {
        return itsBiasNanos != null;
    }

    public double getBiasNanos() {
        return itsBiasNanos;
    }

    public boolean hasBiasUncertaintyNanos() {
        return itsBiasUncertaintyNanos != null;
    }

    public double getBiasUncertaintyNanos() {
        return itsBiasUncertaintyNanos;
    }

    public boolean hasDriftNanosPerSecond() {
        return itsDriftNanosPerSecond != null;
    }

    public double getDriftNanosPerSecond() {
        return itsDriftNanosPerSecond;
    }

    public boolean hasDriftUncertaintyNanosPerSecond() {
        return itsDriftUncertaintyNanosPerSecond != null;
    }

    public double getDriftUncertaintyNanosPerSecond() {
        return itsDriftUncertaintyNanosPerSecond;
    }

    public boolean hasHardwareClockDiscontinuityCount() {
        return itsHardwareClockDiscontinuityCount != null;
    }

    public int getHardwareClockDiscontinuityCount() {
        return itsHardwareClockDiscontinuityCount;
    }

    public boolean hasSvid() {
        return itsSvid != null;
    }

    public int getSvid() {
        return itsSvid;
    }

    public boolean hasTimeOffsetNanos() {
        return itsTimeOffsetNanos != null;
    }

    public double getTimeOffsetNanos() {
        return itsTimeOffsetNanos;
    }

    public boolean hasReceivedSvTimeNanos() {
        return itsReceivedSvTimeNanos != null;
    }

    public long getReceivedSvTimeNanos() {
        return itsReceivedSvTimeNanos;
    }

    public boolean hasReceivedSvTimeUncertaintyNanos() {
        return itsReceivedSvTimeUncertaintyNanos != null;
    }

    public long getReceivedSvTimeUncertaintyNanos() {
        return itsReceivedSvTimeUncertaintyNanos;
    }

    public boolean hasCn0DbHz() {
        return itsCn0DbHz != null;
    }

    public double getCn0DbHz() {
        return itsCn0DbHz;
    }

    public boolean hasPseudorangeRateMetersPerSecond() {
        return itsPseudorangeRateMetersPerSecond != null;
    }

    public double getPseudorangeRateMetersPerSecond() {
        return itsPseudorangeRateMetersPerSecond;
    }

    public boolean hasPseudorangeRateUncertaintyMetersPerSecond() {
        return itsPseudorangeRateUncertaintyMetersPerSecond != null;
    }

    public double getPseudorangeRateUncertaintyMetersPerSecond() {
        return itsPseudorangeRateUncertaintyMetersPerSecond;
    }

    public boolean hasState() {
        return itsState != null;
    }

    public int getState() {
        return itsState;
    }

    public boolean hasAccumulatedDeltaRangeState() {
        return itsAccumulatedDeltaRangeState != null;
    }

    public int getAccumulatedDeltaRangeState() {
        return itsAccumulatedDeltaRangeState;
    }

    public boolean hasAccumulatedDeltaRangeMeters() {
        return itsAccumulatedDeltaRangeMeters != null;
    }

    public double getAccumulatedDeltaRangeMeters() {
        return itsAccumulatedDeltaRangeMeters;
    }

    public boolean hasAccumulatedDeltaRangeUncertaintyMeters() {
        return itsAccumulatedDeltaRangeUncertaintyMeters != null;
    }

    public double getAccumulatedDeltaRangeUncertaintyMeters() {
        return itsAccumulatedDeltaRangeUncertaintyMeters;
    }

    public boolean hasCarrierFrequencyHz() {
        return itsCarrierFrequencyHz != null;
    }

    public double getCarrierFrequencyHz() {
        return itsCarrierFrequencyHz;
    }

    public boolean hasCarrierCycles() {
        return itsCarrierCycles != null;
    }

    public long getCarrierCycles() {
        return itsCarrierCycles;
    }

    public boolean hasCarrierPhase() {
        return itsCarrierPhase != null;
    }

    public double getCarrierPhase() {
        return itsCarrierPhase;
    }

    public boolean hasCarrierPhaseUncertainty() {
        return itsCarrierPhaseUncertainty != null;
    }

    public double getCarrierPhaseUncertainty() {
        return itsCarrierPhaseUncertainty;
    }

    public boolean hasMultipathIndicator() {
        return itsMultipathIndicator != null;
    }

    public int getMultipathIndicator() {
        return itsMultipathIndicator;
    }

    public boolean hasSnrInDb() {
        return itsSnrInDb != null;
    }

    public double getSnrInDb() {
        return itsSnrInDb;
    }

    public boolean hasConstellationType() {
        return itsConstellationType != null;
    }

    public int getConstellationType() {
        return itsConstellationType;
    }

    public boolean hasAgcDb() {
        return itsAgcDb != null;
    }

    public double getAgcDb() {
        return itsAgcDb;
    }

    public boolean hasBasebandCn0DbHz() {
        return itsBasebandCn0DbHz != null;
    }

    public double getBasebandCn0DbHz() {
        return itsBasebandCn0DbHz;
    }

    public boolean hasFullInterSignalBiasNanos() {
        return itsFullInterSignalBiasNanos != null;
    }

    public double getFullInterSignalBiasNanos() {
        return itsFullInterSignalBiasNanos;
    }

    public boolean hasFullInterSignalBiasUncertaintyNanos() {
        return itsFullInterSignalBiasUncertaintyNanos != null;
    }

    public double getFullInterSignalBiasUncertaintyNanos() {
        return itsFullInterSignalBiasUncertaintyNanos;
    }

    public boolean hasSatelliteInterSignalBiasNanos() {
        return itsSatelliteInterSignalBiasNanos != null;
    }

    public double getSatelliteInterSignalBiasNanos() {
        return itsSatelliteInterSignalBiasNanos;
    }

    public boolean hasSatelliteInterSignalBiasUncertaintyNanos() {
        return itsSatelliteInterSignalBiasUncertaintyNanos != null;
    }

    public double getSatelliteInterSignalBiasUncertaintyNanos() {
        return itsSatelliteInterSignalBiasUncertaintyNanos;
    }

    public boolean hasCodeType() {
        return itsCodeType != null;
    }

    public String getCodeType() {
        return itsCodeType;
    }

    public boolean hasChipsetElapsedRealtimeNanos() {
        return itsChipsetElapsedRealtimeNanos != null;
    }

    public long getChipsetElapsedRealtimeNanos() {
        return itsChipsetElapsedRealtimeNanos;
    }

    private Long getLongAt(int index) {
        try {
            return parseLong(getFieldAt(index));
        } catch (NumberFormatException ignored) {
            return null;
        }
    }

    private Integer getIntegerAt(int index) {
        try {
            return parseInt(getFieldAt(index));
        } catch (NumberFormatException ignored) {
            return null;
        }
    }

    private Double getDoubleAt(int index) {
        try {
            return parseDouble(getFieldAt(index));
        } catch (NumberFormatException ignored) {
            return null;
        }
    }

    private String getStringAt(int index) {
        String field = getFieldAt(index);
        if ("".equals(field))
            return null;
        else
            return field;
    }

    private String getFieldAt(int index) {
        if (index < itsFields.length)
            return itsFields[index];
        else
            return "";
    }
}
