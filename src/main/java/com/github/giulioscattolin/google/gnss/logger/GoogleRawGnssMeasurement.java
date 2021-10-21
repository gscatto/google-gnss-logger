package com.github.giulioscattolin.google.gnss.logger;

public abstract class GoogleRawGnssMeasurement implements GoogleGnssLoggerRecord {
    public void accept(GoogleGnssLoggerRecordVisitor visitor) {
        visitor.visit(this);
    }

    public abstract boolean hasUtcTimeMillis();

    public abstract long getUtcTimeMillis();

    public abstract boolean hasTimeNanos();

    public abstract long getTimeNanos();

    public abstract boolean hasLeapSecond();

    public abstract int getLeapSecond();

    public abstract boolean hasTimeUncertaintyNanos();

    public abstract double getTimeUncertaintyNanos();

    public abstract boolean hasFullBiasNanos();

    public abstract long getFullBiasNanos();

    public abstract boolean hasBiasNanos();

    public abstract double getBiasNanos();

    public abstract boolean hasBiasUncertaintyNanos();

    public abstract double getBiasUncertaintyNanos();

    public abstract boolean hasDriftNanosPerSecond();

    public abstract double getDriftNanosPerSecond();

    public abstract boolean hasDriftUncertaintyNanosPerSecond();

    public abstract double getDriftUncertaintyNanosPerSecond();

    public abstract boolean hasHardwareClockDiscontinuityCount();

    public abstract int getHardwareClockDiscontinuityCount();

    public abstract boolean hasSvid();

    public abstract int getSvid();

    public abstract boolean hasTimeOffsetNanos();

    public abstract double getTimeOffsetNanos();

    public abstract boolean hasReceivedSvTimeNanos();

    public abstract long getReceivedSvTimeNanos();

    public abstract boolean hasReceivedSvTimeUncertaintyNanos();

    public abstract long getReceivedSvTimeUncertaintyNanos();

    public abstract boolean hasCn0DbHz();

    public abstract double getCn0DbHz();

    public abstract boolean hasPseudorangeRateMetersPerSecond();

    public abstract double getPseudorangeRateMetersPerSecond();

    public abstract boolean hasPseudorangeRateUncertaintyMetersPerSecond();

    public abstract double getPseudorangeRateUncertaintyMetersPerSecond();

    public abstract boolean hasState();

    public abstract int getState();

    public abstract boolean hasAccumulatedDeltaRangeState();

    public abstract int getAccumulatedDeltaRangeState();

    public abstract boolean hasAccumulatedDeltaRangeMeters();

    public abstract double getAccumulatedDeltaRangeMeters();

    public abstract boolean hasAccumulatedDeltaRangeUncertaintyMeters();

    public abstract double getAccumulatedDeltaRangeUncertaintyMeters();

    public abstract boolean hasCarrierFrequencyHz();

    public abstract double getCarrierFrequencyHz();

    public abstract boolean hasCarrierCycles();

    public abstract long getCarrierCycles();

    public abstract boolean hasCarrierPhase();

    public abstract double getCarrierPhase();

    public abstract boolean hasCarrierPhaseUncertainty();

    public abstract double getCarrierPhaseUncertainty();

    public abstract boolean hasMultipathIndicator();

    public abstract int getMultipathIndicator();

    public abstract boolean hasSnrInDb();

    public abstract double getSnrInDb();

    public abstract boolean hasConstellationType();

    public abstract int getConstellationType();

    public abstract boolean hasAgcDb();

    public abstract double getAgcDb();

    public abstract boolean hasBasebandCn0DbHz();

    public abstract double getBasebandCn0DbHz();

    public abstract boolean hasFullInterSignalBiasNanos();

    public abstract double getFullInterSignalBiasNanos();

    public abstract boolean hasFullInterSignalBiasUncertaintyNanos();

    public abstract double getFullInterSignalBiasUncertaintyNanos();

    public abstract boolean hasSatelliteInterSignalBiasNanos();

    public abstract double getSatelliteInterSignalBiasNanos();

    public abstract boolean hasSatelliteInterSignalBiasUncertaintyNanos();

    public abstract double getSatelliteInterSignalBiasUncertaintyNanos();

    public abstract boolean hasCodeType();

    public abstract String getCodeType();

    public abstract boolean hasChipsetElapsedRealtimeNanos();

    public abstract long getChipsetElapsedRealtimeNanos();
}
