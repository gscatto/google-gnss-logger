package com.github.giulioscattolin;

import static java.lang.Double.isNaN;

class MutableGoogleRawGnssMeasurement extends GoogleRawGnssMeasurement {
    private static final long INVALID_LONG = Long.MAX_VALUE;
    private static final int INVALID_INTEGER = Integer.MAX_VALUE;
    private static final double INVALID_DOUBLE = Double.NaN;
    private long itsUtcTimeMillis = INVALID_LONG;
    private long itsTimeNanos = INVALID_LONG;
    private int itsConstellationType = INVALID_INTEGER;
    private int itsMultipathIndicator = INVALID_INTEGER;
    private int itsLeapSecond = INVALID_INTEGER;
    private double itsTimeUncertaintyNanos = INVALID_DOUBLE;
    private long itsFullBiasNanos = INVALID_LONG;
    private double itsBiasNanos = INVALID_DOUBLE;
    private double itsBiasUncertaintyNanos = INVALID_DOUBLE;
    private double itsDriftNanosPerSecond = INVALID_DOUBLE;
    private double itsDriftUncertaintyNanosPerSecond = INVALID_DOUBLE;
    private int itsHardwareClockDiscontinuityCount = INVALID_INTEGER;
    private int itsSvid = INVALID_INTEGER;
    private double itsTimeOffsetNanos = INVALID_DOUBLE;
    private int itsState = INVALID_INTEGER;
    private long itsReceivedSvTimeNanos = INVALID_LONG;
    private long itsReceivedSvTimeUncertaintyNanos = INVALID_LONG;
    private double itsCn0DbHz = INVALID_DOUBLE;
    private double itsPseudorangeRateMetersPerSecond = INVALID_DOUBLE;
    private double itsPseudorangeRateUncertaintyMetersPerSecond = INVALID_DOUBLE;
    private int itsAccumulatedDeltaRangeState = INVALID_INTEGER;
    private double itsAccumulatedDeltaRangeMeters = INVALID_DOUBLE;
    private double itsAccumulatedDeltaRangeUncertaintyMeters = INVALID_DOUBLE;
    private double itsCarrierFrequencyHz = INVALID_DOUBLE;
    private long itsCarrierCycles = INVALID_LONG;
    private double itsCarrierPhase = INVALID_DOUBLE;
    private double itsCarrierPhaseUncertainty = INVALID_DOUBLE;
    private double itsSnrInDb = INVALID_DOUBLE;
    private double itsAgcDb = INVALID_DOUBLE;
    private double itsBasebandCn0DbHz = INVALID_DOUBLE;
    private double itsFullInterSignalBiasNanos = INVALID_DOUBLE;
    private double itsFullInterSignalBiasUncertaintyNanos = INVALID_DOUBLE;
    private double itsSatelliteInterSignalBiasNanos = INVALID_DOUBLE;
    private double itsSatelliteInterSignalBiasUncertaintyNanos = INVALID_DOUBLE;
    private String itsCodeType = null;
    private long itsChipsetElapsedRealtimeNanos = INVALID_LONG;

    public boolean hasUtcTimeMillis() {
        return itsUtcTimeMillis != INVALID_LONG;
    }

    public long getUtcTimeMillis() {
        return itsUtcTimeMillis;
    }

    public void setUtcTimeMillis(Long itsUtcTimeMillis) {
        this.itsUtcTimeMillis = itsUtcTimeMillis;
    }

    public boolean hasTimeNanos() {
        return itsTimeNanos != INVALID_LONG;
    }

    public long getTimeNanos() {
        return itsTimeNanos;
    }

    public void setTimeNanos(Long itsTimeNanos) {
        this.itsTimeNanos = itsTimeNanos;
    }

    public boolean hasLeapSecond() {
        return itsLeapSecond != INVALID_INTEGER;
    }

    public int getLeapSecond() {
        return itsLeapSecond;
    }

    public void setLeapSecond(int itsLeapSecond) {
        this.itsLeapSecond = itsLeapSecond;
    }

    public boolean hasTimeUncertaintyNanos() {
        return !isNaN(itsTimeUncertaintyNanos);
    }

    public double getTimeUncertaintyNanos() {
        return itsTimeUncertaintyNanos;
    }

    public void setTimeUncertaintyNanos(double itsTimeUncertaintyNanos) {
        this.itsTimeUncertaintyNanos = itsTimeUncertaintyNanos;
    }

    public boolean hasFullBiasNanos() {
        return itsFullBiasNanos != INVALID_LONG;
    }

    public long getFullBiasNanos() {
        return itsFullBiasNanos;
    }

    public void setFullBiasNanos(long itsFullBiasNanos) {
        this.itsFullBiasNanos = itsFullBiasNanos;
    }

    public boolean hasBiasNanos() {
        return !isNaN(itsBiasNanos);
    }

    public double getBiasNanos() {
        return itsBiasNanos;
    }

    public void setBiasNanos(double itsBiasNanos) {
        this.itsBiasNanos = itsBiasNanos;
    }

    public boolean hasBiasUncertaintyNanos() {
        return !isNaN(itsBiasUncertaintyNanos);
    }

    public double getBiasUncertaintyNanos() {
        return itsBiasUncertaintyNanos;
    }

    public void setBiasUncertaintyNanos(double itsBiasUncertaintyNanos) {
        this.itsBiasUncertaintyNanos = itsBiasUncertaintyNanos;
    }

    public boolean hasDriftNanosPerSecond() {
        return !isNaN(itsDriftNanosPerSecond);
    }

    public double getDriftNanosPerSecond() {
        return itsDriftNanosPerSecond;
    }

    public void setDriftNanosPerSecond(double itsDriftNanosPerSecond) {
        this.itsDriftNanosPerSecond = itsDriftNanosPerSecond;
    }

    public boolean hasDriftUncertaintyNanosPerSecond() {
        return !isNaN(itsDriftUncertaintyNanosPerSecond);
    }

    public double getDriftUncertaintyNanosPerSecond() {
        return itsDriftUncertaintyNanosPerSecond;
    }

    public void setDriftUncertaintyNanosPerSecond(double itsDriftUncertaintyNanosPerSecond) {
        this.itsDriftUncertaintyNanosPerSecond = itsDriftUncertaintyNanosPerSecond;
    }

    public boolean hasHardwareClockDiscontinuityCount() {
        return itsHardwareClockDiscontinuityCount != INVALID_INTEGER;
    }

    public int getHardwareClockDiscontinuityCount() {
        return itsHardwareClockDiscontinuityCount;
    }

    public void setHardwareClockDiscontinuityCount(int itsHardwareClockDiscontinuityCount) {
        this.itsHardwareClockDiscontinuityCount = itsHardwareClockDiscontinuityCount;
    }

    public boolean hasSvid() {
        return itsSvid != INVALID_INTEGER;
    }

    public int getSvid() {
        return itsSvid;
    }

    public void setSvid(int itsSvid) {
        this.itsSvid = itsSvid;
    }

    public boolean hasTimeOffsetNanos() {
        return !isNaN(itsTimeOffsetNanos);
    }

    public double getTimeOffsetNanos() {
        return itsTimeOffsetNanos;
    }

    public void setTimeOffsetNanos(double itsTimeOffsetNanos) {
        this.itsTimeOffsetNanos = itsTimeOffsetNanos;
    }

    public boolean hasReceivedSvTimeNanos() {
        return itsReceivedSvTimeNanos != INVALID_LONG;
    }

    public long getReceivedSvTimeNanos() {
        return itsReceivedSvTimeNanos;
    }

    public void setReceivedSvTimeNanos(long itsReceivedSvTimeNanos) {
        this.itsReceivedSvTimeNanos = itsReceivedSvTimeNanos;
    }

    public boolean hasReceivedSvTimeUncertaintyNanos() {
        return itsReceivedSvTimeUncertaintyNanos != INVALID_LONG;
    }

    public long getReceivedSvTimeUncertaintyNanos() {
        return itsReceivedSvTimeUncertaintyNanos;
    }

    public void setReceivedSvTimeUncertaintyNanos(long itsReceivedSvTimeUncertaintyNanos) {
        this.itsReceivedSvTimeUncertaintyNanos = itsReceivedSvTimeUncertaintyNanos;
    }

    public boolean hasCn0DbHz() {
        return !isNaN(itsCn0DbHz);
    }

    public double getCn0DbHz() {
        return itsCn0DbHz;
    }

    public void setCn0DbHz(double itsCn0DbHz) {
        this.itsCn0DbHz = itsCn0DbHz;
    }

    public boolean hasPseudorangeRateMetersPerSecond() {
        return !isNaN(itsPseudorangeRateMetersPerSecond);
    }

    public double getPseudorangeRateMetersPerSecond() {
        return itsPseudorangeRateMetersPerSecond;
    }

    public void setPseudorangeRateMetersPerSecond(double itsPseudorangeRateMetersPerSecond) {
        this.itsPseudorangeRateMetersPerSecond = itsPseudorangeRateMetersPerSecond;
    }

    public boolean hasPseudorangeRateUncertaintyMetersPerSecond() {
        return !isNaN(itsPseudorangeRateUncertaintyMetersPerSecond);
    }

    public double getPseudorangeRateUncertaintyMetersPerSecond() {
        return itsPseudorangeRateUncertaintyMetersPerSecond;
    }

    public void setPseudorangeRateUncertaintyMetersPerSecond(double itsPseudorangeRateUncertaintyMetersPerSecond) {
        this.itsPseudorangeRateUncertaintyMetersPerSecond = itsPseudorangeRateUncertaintyMetersPerSecond;
    }

    public boolean hasState() {
        return itsState != INVALID_INTEGER;
    }

    public int getState() {
        return itsState;
    }

    public void setState(int itsState) {
        this.itsState = itsState;
    }

    public boolean hasAccumulatedDeltaRangeState() {
        return itsAccumulatedDeltaRangeState != INVALID_INTEGER;
    }

    public int getAccumulatedDeltaRangeState() {
        return itsAccumulatedDeltaRangeState;
    }

    public void setAccumulatedDeltaRangeState(int itsAccumulatedDeltaRangeState) {
        this.itsAccumulatedDeltaRangeState = itsAccumulatedDeltaRangeState;
    }

    public boolean hasAccumulatedDeltaRangeMeters() {
        return !isNaN(itsAccumulatedDeltaRangeMeters);
    }

    public double getAccumulatedDeltaRangeMeters() {
        return itsAccumulatedDeltaRangeMeters;
    }

    public void setAccumulatedDeltaRangeMeters(double itsAccumulatedDeltaRangeMeters) {
        this.itsAccumulatedDeltaRangeMeters = itsAccumulatedDeltaRangeMeters;
    }

    public boolean hasAccumulatedDeltaRangeUncertaintyMeters() {
        return !isNaN(itsAccumulatedDeltaRangeUncertaintyMeters);
    }

    public double getAccumulatedDeltaRangeUncertaintyMeters() {
        return itsAccumulatedDeltaRangeUncertaintyMeters;
    }

    public void setAccumulatedDeltaRangeUncertaintyMeters(double itsAccumulatedDeltaRangeUncertaintyMeters) {
        this.itsAccumulatedDeltaRangeUncertaintyMeters = itsAccumulatedDeltaRangeUncertaintyMeters;
    }

    public boolean hasCarrierFrequencyHz() {
        return !isNaN(itsCarrierFrequencyHz);
    }

    public double getCarrierFrequencyHz() {
        return itsCarrierFrequencyHz;
    }

    public void setCarrierFrequencyHz(double itsCarrierFrequencyHz) {
        this.itsCarrierFrequencyHz = itsCarrierFrequencyHz;
    }

    public boolean hasCarrierCycles() {
        return itsCarrierCycles != INVALID_LONG;
    }

    public long getCarrierCycles() {
        return itsCarrierCycles;
    }

    public void setCarrierCycles(long itsCarrierCycles) {
        this.itsCarrierCycles = itsCarrierCycles;
    }

    public boolean hasCarrierPhase() {
        return !isNaN(itsCarrierPhase);
    }

    public double getCarrierPhase() {
        return itsCarrierPhase;
    }

    public void setCarrierPhase(double itsCarrierPhase) {
        this.itsCarrierPhase = itsCarrierPhase;
    }

    public boolean hasCarrierPhaseUncertainty() {
        return !isNaN(itsCarrierPhaseUncertainty);
    }

    public double getCarrierPhaseUncertainty() {
        return itsCarrierPhaseUncertainty;
    }

    public void setCarrierPhaseUncertainty(double itsCarrierPhaseUncertainty) {
        this.itsCarrierPhaseUncertainty = itsCarrierPhaseUncertainty;
    }

    public boolean hasMultipathIndicator() {
        return itsMultipathIndicator != INVALID_INTEGER;
    }

    public int getMultipathIndicator() {
        return itsMultipathIndicator;
    }

    public void setMultipathIndicator(int itsMultipathIndicator) {
        this.itsMultipathIndicator = itsMultipathIndicator;
    }

    public boolean hasSnrInDb() {
        return !isNaN(itsSnrInDb);
    }

    public double getSnrInDb() {
        return itsSnrInDb;
    }

    public void setSnrInDb(double itsSnrInDb) {
        this.itsSnrInDb = itsSnrInDb;
    }

    public boolean hasConstellationType() {
        return itsConstellationType != INVALID_INTEGER;
    }

    public int getConstellationType() {
        return itsConstellationType;
    }

    public void setConstellationType(int itsConstellationType) {
        this.itsConstellationType = itsConstellationType;
    }

    public boolean hasAgcDb() {
        return !isNaN(itsAgcDb);
    }

    public double getAgcDb() {
        return itsAgcDb;
    }

    public void setAgcDb(double itsAgcDb) {
        this.itsAgcDb = itsAgcDb;
    }

    public boolean hasBasebandCn0DbHz() {
        return !isNaN(itsBasebandCn0DbHz);
    }

    public double getBasebandCn0DbHz() {
        return itsBasebandCn0DbHz;
    }

    public void setBasebandCn0DbHz(double itsBasebandCn0DbHz) {
        this.itsBasebandCn0DbHz = itsBasebandCn0DbHz;
    }

    public boolean hasFullInterSignalBiasNanos() {
        return !isNaN(itsFullInterSignalBiasNanos);
    }

    public double getFullInterSignalBiasNanos() {
        return itsFullInterSignalBiasNanos;
    }

    public void setFullInterSignalBiasNanos(double itsFullInterSignalBiasNanos) {
        this.itsFullInterSignalBiasNanos = itsFullInterSignalBiasNanos;
    }

    public boolean hasFullInterSignalBiasUncertaintyNanos() {
        return !isNaN(itsFullInterSignalBiasUncertaintyNanos);
    }

    public double getFullInterSignalBiasUncertaintyNanos() {
        return itsFullInterSignalBiasUncertaintyNanos;
    }

    public void setFullInterSignalBiasUncertaintyNanos(double itsFullInterSignalBiasUncertaintyNanos) {
        this.itsFullInterSignalBiasUncertaintyNanos = itsFullInterSignalBiasUncertaintyNanos;
    }

    public boolean hasSatelliteInterSignalBiasNanos() {
        return !isNaN(itsSatelliteInterSignalBiasNanos);
    }

    public double getSatelliteInterSignalBiasNanos() {
        return itsSatelliteInterSignalBiasNanos;
    }

    public void setSatelliteInterSignalBiasNanos(double itsSatelliteInterSignalBiasNanos) {
        this.itsSatelliteInterSignalBiasNanos = itsSatelliteInterSignalBiasNanos;
    }

    public boolean hasSatelliteInterSignalBiasUncertaintyNanos() {
        return !isNaN(itsSatelliteInterSignalBiasUncertaintyNanos);
    }

    public double getSatelliteInterSignalBiasUncertaintyNanos() {
        return itsSatelliteInterSignalBiasUncertaintyNanos;
    }

    public void setSatelliteInterSignalBiasUncertaintyNanos(double itsSatelliteInterSignalBiasUncertaintyNanos) {
        this.itsSatelliteInterSignalBiasUncertaintyNanos = itsSatelliteInterSignalBiasUncertaintyNanos;
    }

    public boolean hasCodeType() {
        return itsCodeType != null;
    }

    public String getCodeType() {
        return itsCodeType;
    }

    public void setCodeType(String itsCodeType) {
        this.itsCodeType = itsCodeType;
    }

    public boolean hasChipsetElapsedRealtimeNanos() {
        return itsChipsetElapsedRealtimeNanos != INVALID_LONG;
    }

    public long getChipsetElapsedRealtimeNanos() {
        return itsChipsetElapsedRealtimeNanos;
    }

    public void setChipsetElapsedRealtimeNanos(long itsChipsetElapsedRealtimeNanos) {
        this.itsChipsetElapsedRealtimeNanos = itsChipsetElapsedRealtimeNanos;
    }
}
