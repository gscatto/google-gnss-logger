package com.github.giulioscattolin.google.gnss.logger;

/**
 * Represents <code>Raw</code> records.
 */
public abstract class GoogleRawGnssMeasurement implements GoogleGnssLoggerRecord {
    public void accept(GoogleGnssLoggerRecordVisitor visitor) {
        visitor.visit(this);
    }

    /**
     * Returns <code>true</code> if field <code>utcTimeMillis</code> is present, <code>false</code> otherwise.
     */
    public abstract boolean hasUtcTimeMillis();

    public abstract long getUtcTimeMillis();

    /**
     * Returns <code>true</code> if field <code>TimeNanos</code> is present, <code>false</code> otherwise.
     */
    public abstract boolean hasTimeNanos();

    public abstract long getTimeNanos();

    /**
     * Returns <code>true</code> if field <code>LeapSecond</code> is present, <code>false</code> otherwise.
     */
    public abstract boolean hasLeapSecond();

    public abstract int getLeapSecond();

    /**
     * Returns <code>true</code> if field <code>TimeUncertaintyNanos</code> is present, <code>false</code> otherwise.
     */
    public abstract boolean hasTimeUncertaintyNanos();

    public abstract double getTimeUncertaintyNanos();

    /**
     * Returns <code>true</code> if field <code>FullBiasNanos</code> is present, <code>false</code> otherwise.
     */
    public abstract boolean hasFullBiasNanos();

    public abstract long getFullBiasNanos();

    /**
     * Returns <code>true</code> if field <code>BiasNanos</code> is present, <code>false</code> otherwise.
     */
    public abstract boolean hasBiasNanos();

    public abstract double getBiasNanos();

    /**
     * Returns <code>true</code> if field <code>BiasUncertaintyNanos</code> is present, <code>false</code> otherwise.
     */
    public abstract boolean hasBiasUncertaintyNanos();

    public abstract double getBiasUncertaintyNanos();

    /**
     * Returns <code>true</code> if field <code>DriftNanosPerSecond</code> is present, <code>false</code> otherwise.
     */
    public abstract boolean hasDriftNanosPerSecond();

    public abstract double getDriftNanosPerSecond();

    /**
     * Returns <code>true</code> if field <code>DriftUncertaintyNanosPerSecond</code> is present, <code>false</code> otherwise.
     */
    public abstract boolean hasDriftUncertaintyNanosPerSecond();

    public abstract double getDriftUncertaintyNanosPerSecond();

    /**
     * Returns <code>true</code> if field <code>HardwareClockDiscontinuityCount</code> is present, <code>false</code> otherwise.
     */
    public abstract boolean hasHardwareClockDiscontinuityCount();

    public abstract int getHardwareClockDiscontinuityCount();

    /**
     * Returns <code>true</code> if field <code>Svid</code> is present, <code>false</code> otherwise.
     */
    public abstract boolean hasSvid();

    public abstract int getSvid();

    /**
     * Returns <code>true</code> if field <code>TimeOffsetNanos</code> is present, <code>false</code> otherwise.
     */
    public abstract boolean hasTimeOffsetNanos();

    public abstract double getTimeOffsetNanos();

    /**
     * Returns <code>true</code> if field <code>ReceivedSvTimeNanos</code> is present, <code>false</code> otherwise.
     */
    public abstract boolean hasReceivedSvTimeNanos();

    public abstract long getReceivedSvTimeNanos();

    /**
     * Returns <code>true</code> if field <code>ReceivedSvTimeUncertaintyNanos</code> is present, <code>false</code> otherwise.
     */
    public abstract boolean hasReceivedSvTimeUncertaintyNanos();

    public abstract long getReceivedSvTimeUncertaintyNanos();

    /**
     * Returns <code>true</code> if field <code>Cn0DbHz</code> is present, <code>false</code> otherwise.
     */
    public abstract boolean hasCn0DbHz();

    public abstract double getCn0DbHz();

    /**
     * Returns <code>true</code> if field <code>PseudorangeRateMetersPerSecond</code> is present, <code>false</code> otherwise.
     */
    public abstract boolean hasPseudorangeRateMetersPerSecond();

    public abstract double getPseudorangeRateMetersPerSecond();

    /**
     * Returns <code>true</code> if field <code>PseudorangeRateUncertaintyMetersPerSecond</code> is present, <code>false</code> otherwise.
     */
    public abstract boolean hasPseudorangeRateUncertaintyMetersPerSecond();

    public abstract double getPseudorangeRateUncertaintyMetersPerSecond();

    /**
     * Returns <code>true</code> if field <code>State</code> is present, <code>false</code> otherwise.
     */
    public abstract boolean hasState();

    public abstract int getState();

    /**
     * Returns <code>true</code> if field <code>AccumulatedDeltaRangeState</code> is present, <code>false</code> otherwise.
     */
    public abstract boolean hasAccumulatedDeltaRangeState();

    public abstract int getAccumulatedDeltaRangeState();

    /**
     * Returns <code>true</code> if field <code>AccumulatedDeltaRangeMeters</code> is present, <code>false</code> otherwise.
     */
    public abstract boolean hasAccumulatedDeltaRangeMeters();

    public abstract double getAccumulatedDeltaRangeMeters();

    /**
     * Returns <code>true</code> if field <code>AccumulatedDeltaRangeUncertaintyMeters</code> is present, <code>false</code> otherwise.
     */
    public abstract boolean hasAccumulatedDeltaRangeUncertaintyMeters();

    public abstract double getAccumulatedDeltaRangeUncertaintyMeters();

    /**
     * Returns <code>true</code> if field <code>CarrierFrequencyHz</code> is present, <code>false</code> otherwise.
     */
    public abstract boolean hasCarrierFrequencyHz();

    public abstract double getCarrierFrequencyHz();

    /**
     * Returns <code>true</code> if field <code>CarrierCycles</code> is present, <code>false</code> otherwise.
     */
    public abstract boolean hasCarrierCycles();

    public abstract long getCarrierCycles();

    /**
     * Returns <code>true</code> if field <code>CarrierPhase</code> is present, <code>false</code> otherwise.
     */
    public abstract boolean hasCarrierPhase();

    public abstract double getCarrierPhase();

    /**
     * Returns <code>true</code> if field <code>CarrierPhaseUncertainty</code> is present, <code>false</code> otherwise.
     */
    public abstract boolean hasCarrierPhaseUncertainty();

    public abstract double getCarrierPhaseUncertainty();

    /**
     * Returns <code>true</code> if field <code>MultipathIndicator</code> is present, <code>false</code> otherwise.
     */
    public abstract boolean hasMultipathIndicator();

    public abstract int getMultipathIndicator();

    /**
     * Returns <code>true</code> if field <code>SnrInDb</code> is present, <code>false</code> otherwise.
     */
    public abstract boolean hasSnrInDb();

    public abstract double getSnrInDb();

    /**
     * Returns <code>true</code> if field <code>ConstellationType</code> is present, <code>false</code> otherwise.
     */
    public abstract boolean hasConstellationType();

    public abstract int getConstellationType();

    /**
     * Returns <code>true</code> if field <code>AgcDb</code> is present, <code>false</code> otherwise.
     */
    public abstract boolean hasAgcDb();

    public abstract double getAgcDb();

    /**
     * Returns <code>true</code> if field <code>BasebandCn0DbHz</code> is present, <code>false</code> otherwise.
     */
    public abstract boolean hasBasebandCn0DbHz();

    public abstract double getBasebandCn0DbHz();

    /**
     * Returns <code>true</code> if field <code>FullInterSignalBiasNanos</code> is present, <code>false</code> otherwise.
     */
    public abstract boolean hasFullInterSignalBiasNanos();

    public abstract double getFullInterSignalBiasNanos();

    /**
     * Returns <code>true</code> if field <code>FullInterSignalBiasUncertaintyNanos</code> is present, <code>false</code> otherwise.
     */
    public abstract boolean hasFullInterSignalBiasUncertaintyNanos();

    public abstract double getFullInterSignalBiasUncertaintyNanos();

    /**
     * Returns <code>true</code> if field <code>SatelliteInterSignalBiasNanos</code> is present, <code>false</code> otherwise.
     */
    public abstract boolean hasSatelliteInterSignalBiasNanos();

    public abstract double getSatelliteInterSignalBiasNanos();

    /**
     * Returns <code>true</code> if field <code>SatelliteInterSignalBiasUncertaintyNanos</code> is present, <code>false</code> otherwise.
     */
    public abstract boolean hasSatelliteInterSignalBiasUncertaintyNanos();

    public abstract double getSatelliteInterSignalBiasUncertaintyNanos();

    /**
     * Returns <code>true</code> if field <code>CodeType</code> is present, <code>false</code> otherwise.
     */
    public abstract boolean hasCodeType();

    public abstract String getCodeType();

    /**
     * Returns <code>true</code> if field <code>ChipsetElapsedRealtimeNanos</code> is present, <code>false</code> otherwise.
     */
    public abstract boolean hasChipsetElapsedRealtimeNanos();

    public abstract long getChipsetElapsedRealtimeNanos();
}
