package com.github.giulioscattolin.google.gnss.logger;

/**
 * A {@link GoogleRawGnssMeasurementLineReader} that reads eagerly only the selected the fields.
 */
public class FilteredEagerGoogleRawGnssMeasurementLineReader extends GoogleRawGnssMeasurementLineReader {
    private final GoogleGnssLoggerRecordCollector itsCollector;
    private final GoogleRawGnssMeasurementField[] itsFilteredFields;

    public FilteredEagerGoogleRawGnssMeasurementLineReader(GoogleGnssLoggerRecordCollector collector, GoogleRawGnssMeasurementField[] fields) {
        itsCollector = collector;
        itsFilteredFields = fields;
    }

    public void readGoogleRawGnssMeasurement(String line) {
        itsCollector.collect(new Read(line).itsGoogleRawGnssMeasurement);
    }

    class Read extends EagerGoogleRawGnssMeasurementLineReader.Read {
        Read(String line) {
            super(line);
        }

        protected void read() {
            for (GoogleRawGnssMeasurementField filteredField : itsFilteredFields)
                read(filteredField);
        }

        private void read(GoogleRawGnssMeasurementField filteredField) {
            switch (filteredField) {
                case UTC_TIME_MILLIS:
                    readUtcTimeMillis();
                    break;
                case TIME_NANOS:
                    readTimeNanos();
                    break;
                case LEAP_SECONDS:
                    readLeapSecond();
                    break;
                case TIME_UNCERTAINTY_NANOS:
                    readTimeUncertaintyNanos();
                    break;
                case FULL_BIAS_NANOS:
                    readFullBiasNanos();
                    break;
                case BIAS_NANOS:
                    readBiasNanos();
                    break;
                case BIAS_UNCERTAINTY_NANOS:
                    readBiasUncertaintyNanos();
                    break;
                case DRIFT_NANOS_PER_SECOND:
                    readDriftNanosPerSecond();
                    break;
                case DRIFT_UNCERTAINTY_NANOS_PER_SECOND:
                    readDriftUncertaintyNanosPerSecond();
                    break;
                case HARDWARE_CLOCK_DISCONTINUITY_COUNT:
                    readHardwareClockDiscontinuityCount();
                    break;
                case SVID:
                    readSvid();
                    break;
                case TIME_OFFSET_NANOS:
                    readTimeOffsetNanos();
                    break;
                case STATE:
                    readState();
                    break;
                case RECEIVED_SV_TIME_NANOS:
                    readReceivedSvTimeNanos();
                    break;
                case RECEIVED_SV_TIME_UNCERTAINTY_NANOS:
                    readReceivedSvTimeUncertaintyNanos();
                    break;
                case CN0DBHZ:
                    readCn0DbHz();
                    break;
                case PSEUDORANGE_RATE_METERS_PER_SECOND:
                    readPseudorangeRateMetersPerSecond();
                    break;
                case PSEUDORANGE_RATE_UNCERTAINTY_METERS_PER_SECOND:
                    readPseudorangeRateUncertaintyMetersPerSecond();
                    break;
                case ACCUMULATED_DELTA_RANGE_STATE:
                    readAccumulatedDeltaRangeState();
                    break;
                case ACCUMULATED_DELTA_RANGE_METERS:
                    readAccumulatedDeltaRangeMeters();
                    break;
                case ACCUMULATED_DELTA_UNCERTAINTY_METERS:
                    readAccumulatedDeltaRangeUncertaintyMeters();
                    break;
                case CARRIER_FREQUENCY_HZ:
                    readCarrierFrequencyHz();
                    break;
                case CARRIER_CYCLES:
                    readCarrierCycles();
                    break;
                case CARRIER_PHASE:
                    readCarrierPhase();
                    break;
                case CARRIER_PHASE_UNCERTAINTY:
                    readCarrierPhaseUncertainty();
                    break;
                case MULTIPATH_INDICATOR:
                    readMultipathIndicator();
                    break;
                case SNR_IN_DB:
                    readSnrInDb();
                    break;
                case CONSTELLATION_TYPE:
                    readConstellationType();
                    break;
                case AGC_DB:
                    readAgcDb();
                    break;
                case BASEBAND_CN0DBHZ:
                    readBasebandCn0DbHz();
                    break;
                case FULL_INTER_SIGNAL_BIAS_NANOS:
                    readFullInterSignalBiasNanos();
                    break;
                case FULL_INTER_SIGNAL_BIAS_UNCERTAINTY_NANOS:
                    readFullInterSignalBiasUncertaintyNanos();
                    break;
                case SATELLITE_INTER_SIGNAL_BIAS_NANOS:
                    readSatelliteInterSignalBiasNanos();
                    break;
                case SATELLITE_INTER_SIGNAL_UNCERTAINTY_BIAS_NANOS:
                    readSatelliteInterSignalBiasUncertaintyNanos();
                    break;
                case CODE_TYPE:
                    readCodeType();
                    break;
                case CHIPSET_ELAPSED_REALTIME_NANOS:
                    readChipsetElapsedRealtimeNanos();
                    break;
            }
        }
    }
}
