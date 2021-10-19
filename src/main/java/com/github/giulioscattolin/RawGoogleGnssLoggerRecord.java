package com.github.giulioscattolin;


public abstract class RawGoogleGnssLoggerRecord implements GoogleGnssLoggerRecord {
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

    public abstract boolean hasState();

    public abstract int getState();

    public boolean doesStateMatch(int flags) {
        return (getState() & flags) == flags;
    }

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

    interface ConstellationType {
        int BEIDOU = 5;
        int GALILEO = 6;
        int GLONASS = 3;
        int GPS = 1;
        int IRNSS = 7;
        int QZSS = 4;
        int SBAS = 2;
        int UNKNOWN = 0;

        static String toMacroCase(int value) {
            switch (value) {
                case BEIDOU:
                    return "BEIDOU";
                case GALILEO:
                    return "GALILEO";
                case GLONASS:
                    return "GLONASS";
                case GPS:
                    return "GPS";
                case IRNSS:
                    return "IRNSS";
                case QZSS:
                    return "QZSS";
                case SBAS:
                    return "SBAS";
                case UNKNOWN:
                    return "UNKNOWN";
                default:
                    return "?";
            }
        }
    }

    interface State {
        int STATE_2ND_CODE_LOCK = 65536;
        int STATE_BDS_D2_BIT_SYNC = 256;
        int STATE_BDS_D2_SUBFRAME_SYNC = 512;
        int STATE_BIT_SYNC = 2;
        int STATE_CODE_LOCK = 1;
        int STATE_GAL_E1BC_CODE_LOCK = 1024;
        int STATE_GAL_E1B_PAGE_SYNC = 4096;
        int STATE_GAL_E1C_2ND_CODE_LOCK = 2048;
        int STATE_GLO_STRING_SYNC = 64;
        int STATE_GLO_TOD_DECODED = 128;
        int STATE_GLO_TOD_KNOWN = 32768;
        int STATE_MSEC_AMBIGUOUS = 16;
        int STATE_SBAS_SYNC = 8192;
        int STATE_SUBFRAME_SYNC = 4;
        int STATE_SYMBOL_SYNC = 32;
        int STATE_TOW_DECODED = 8;
        int STATE_TOW_KNOWN = 16384;
        int STATE_UNKNOWN = 0;
    }
}
