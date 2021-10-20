package com.github.giulioscattolin;

import org.junit.Test;

import static com.github.giulioscattolin.EagerGoogleRawGnssMeasurementLineAdapter.readLine;
import static com.google.common.truth.Truth.assertThat;

public class EagerGoogleRawGnssMeasurementLineAdapterTest implements GoogleGnssLoggerRecordCollector, GoogleGnssLoggerRecordVisitor {
    String itsLine;
    GoogleRawGnssMeasurement itsGoogleRawGnssMeasurement;

    @Test
    public void testEmptyLine() {
        itsLine = "";

        readLine(itsLine, this);

        assertThat(itsGoogleRawGnssMeasurement).isNull();
    }

    @Test
    public void testEmpty() {
        itsLine = "Raw";

        readLine(itsLine, this);

        assertThat(itsGoogleRawGnssMeasurement.hasUtcTimeMillis()).isFalse();
        assertThat(itsGoogleRawGnssMeasurement.hasTimeNanos()).isFalse();
        assertThat(itsGoogleRawGnssMeasurement.hasLeapSecond()).isFalse();
        assertThat(itsGoogleRawGnssMeasurement.hasTimeUncertaintyNanos()).isFalse();
        assertThat(itsGoogleRawGnssMeasurement.hasFullBiasNanos()).isFalse();
        assertThat(itsGoogleRawGnssMeasurement.hasBiasNanos()).isFalse();
        assertThat(itsGoogleRawGnssMeasurement.hasBiasUncertaintyNanos()).isFalse();
        assertThat(itsGoogleRawGnssMeasurement.hasDriftNanosPerSecond()).isFalse();
        assertThat(itsGoogleRawGnssMeasurement.hasDriftUncertaintyNanosPerSecond()).isFalse();
        assertThat(itsGoogleRawGnssMeasurement.hasHardwareClockDiscontinuityCount()).isFalse();
        assertThat(itsGoogleRawGnssMeasurement.hasSvid()).isFalse();
        assertThat(itsGoogleRawGnssMeasurement.hasTimeOffsetNanos()).isFalse();
        assertThat(itsGoogleRawGnssMeasurement.hasState()).isFalse();
        assertThat(itsGoogleRawGnssMeasurement.hasReceivedSvTimeNanos()).isFalse();
        assertThat(itsGoogleRawGnssMeasurement.hasReceivedSvTimeUncertaintyNanos()).isFalse();
        assertThat(itsGoogleRawGnssMeasurement.hasCn0DbHz()).isFalse();
        assertThat(itsGoogleRawGnssMeasurement.hasPseudorangeRateMetersPerSecond()).isFalse();
        assertThat(itsGoogleRawGnssMeasurement.hasPseudorangeRateUncertaintyMetersPerSecond()).isFalse();
        assertThat(itsGoogleRawGnssMeasurement.hasAccumulatedDeltaRangeState()).isFalse();
        assertThat(itsGoogleRawGnssMeasurement.hasAccumulatedDeltaRangeMeters()).isFalse();
        assertThat(itsGoogleRawGnssMeasurement.hasAccumulatedDeltaRangeUncertaintyMeters()).isFalse();
        assertThat(itsGoogleRawGnssMeasurement.hasCarrierFrequencyHz()).isFalse();
        assertThat(itsGoogleRawGnssMeasurement.hasCarrierCycles()).isFalse();
        assertThat(itsGoogleRawGnssMeasurement.hasCarrierPhase()).isFalse();
        assertThat(itsGoogleRawGnssMeasurement.hasCarrierPhaseUncertainty()).isFalse();
        assertThat(itsGoogleRawGnssMeasurement.hasSnrInDb()).isFalse();
        assertThat(itsGoogleRawGnssMeasurement.hasAgcDb()).isFalse();
        assertThat(itsGoogleRawGnssMeasurement.hasBasebandCn0DbHz()).isFalse();
        assertThat(itsGoogleRawGnssMeasurement.hasFullInterSignalBiasNanos()).isFalse();
        assertThat(itsGoogleRawGnssMeasurement.hasSatelliteInterSignalBiasNanos()).isFalse();
        assertThat(itsGoogleRawGnssMeasurement.hasCodeType()).isFalse();
        assertThat(itsGoogleRawGnssMeasurement.hasChipsetElapsedRealtimeNanos()).isFalse();
        assertThat(itsGoogleRawGnssMeasurement.hasChipsetElapsedRealtimeNanos()).isFalse();
        assertThat(itsGoogleRawGnssMeasurement.hasConstellationType()).isFalse();
        assertThat(itsGoogleRawGnssMeasurement.hasMultipathIndicator()).isFalse();
    }

    @Test
    public void testV3001() {
        itsLine = "Raw,1619345912440,214237039000000,18,,-1303166893401161864,-0.4595146179199219,28.050781111232936,-2.563994083470523,14.912393214232969,53,25,0.0,16399,37130373020312,13,35.5,-104.33929443359375,0.04440000280737877,16,-0.0,1902.9177342976868,1.57542003E9,,,,0,,1,-2.11,31.9,0.0,0.0,,,C,313851404442744";

        readLine(itsLine, this);

        assertThat(itsGoogleRawGnssMeasurement.hasUtcTimeMillis()).isTrue();
        assertThat(itsGoogleRawGnssMeasurement.getUtcTimeMillis()).isEqualTo(1619345912440L);
        assertThat(itsGoogleRawGnssMeasurement.hasTimeNanos()).isTrue();
        assertThat(itsGoogleRawGnssMeasurement.getTimeNanos()).isEqualTo(214237039000000L);
        assertThat(itsGoogleRawGnssMeasurement.hasLeapSecond()).isTrue();
        assertThat(itsGoogleRawGnssMeasurement.getLeapSecond()).isEqualTo(18);
        assertThat(itsGoogleRawGnssMeasurement.hasTimeUncertaintyNanos()).isFalse();
        assertThat(itsGoogleRawGnssMeasurement.hasFullBiasNanos()).isTrue();
        assertThat(itsGoogleRawGnssMeasurement.getFullBiasNanos()).isEqualTo(-1303166893401161864L);
        assertThat(itsGoogleRawGnssMeasurement.hasBiasNanos()).isTrue();
        assertThat(itsGoogleRawGnssMeasurement.getBiasNanos()).isEqualTo(-0.4595146179199219);
        assertThat(itsGoogleRawGnssMeasurement.hasBiasUncertaintyNanos()).isTrue();
        assertThat(itsGoogleRawGnssMeasurement.getBiasUncertaintyNanos()).isEqualTo(28.050781111232936);
        assertThat(itsGoogleRawGnssMeasurement.hasDriftNanosPerSecond()).isTrue();
        assertThat(itsGoogleRawGnssMeasurement.getDriftNanosPerSecond()).isEqualTo(-2.563994083470523);
        assertThat(itsGoogleRawGnssMeasurement.hasDriftUncertaintyNanosPerSecond()).isTrue();
        assertThat(itsGoogleRawGnssMeasurement.getDriftUncertaintyNanosPerSecond()).isEqualTo(14.912393214232969);
        assertThat(itsGoogleRawGnssMeasurement.hasHardwareClockDiscontinuityCount()).isTrue();
        assertThat(itsGoogleRawGnssMeasurement.getHardwareClockDiscontinuityCount()).isEqualTo(53);
        assertThat(itsGoogleRawGnssMeasurement.hasSvid()).isTrue();
        assertThat(itsGoogleRawGnssMeasurement.getSvid()).isEqualTo(25);
        assertThat(itsGoogleRawGnssMeasurement.hasTimeOffsetNanos()).isTrue();
        assertThat(itsGoogleRawGnssMeasurement.getTimeOffsetNanos()).isEqualTo(0.0);
        assertThat(itsGoogleRawGnssMeasurement.hasState()).isTrue();
        assertThat(itsGoogleRawGnssMeasurement.getState()).isEqualTo(16399);
        assertThat(itsGoogleRawGnssMeasurement.hasReceivedSvTimeNanos()).isTrue();
        assertThat(itsGoogleRawGnssMeasurement.getReceivedSvTimeNanos()).isEqualTo(37130373020312L);
        assertThat(itsGoogleRawGnssMeasurement.hasReceivedSvTimeUncertaintyNanos()).isTrue();
        assertThat(itsGoogleRawGnssMeasurement.getReceivedSvTimeUncertaintyNanos()).isEqualTo(13);
        assertThat(itsGoogleRawGnssMeasurement.hasCn0DbHz()).isTrue();
        assertThat(itsGoogleRawGnssMeasurement.getCn0DbHz()).isEqualTo(35.5);
        assertThat(itsGoogleRawGnssMeasurement.hasPseudorangeRateMetersPerSecond()).isTrue();
        assertThat(itsGoogleRawGnssMeasurement.getPseudorangeRateMetersPerSecond()).isEqualTo(-104.33929443359375);
        assertThat(itsGoogleRawGnssMeasurement.hasPseudorangeRateUncertaintyMetersPerSecond()).isTrue();
        assertThat(itsGoogleRawGnssMeasurement.getPseudorangeRateUncertaintyMetersPerSecond()).isEqualTo(0.04440000280737877);
        assertThat(itsGoogleRawGnssMeasurement.hasAccumulatedDeltaRangeState()).isTrue();
        assertThat(itsGoogleRawGnssMeasurement.getAccumulatedDeltaRangeState()).isEqualTo(16);
        assertThat(itsGoogleRawGnssMeasurement.hasAccumulatedDeltaRangeMeters()).isTrue();
        assertThat(itsGoogleRawGnssMeasurement.getAccumulatedDeltaRangeMeters()).isEqualTo(-0.0);
        assertThat(itsGoogleRawGnssMeasurement.hasAccumulatedDeltaRangeUncertaintyMeters()).isTrue();
        assertThat(itsGoogleRawGnssMeasurement.getAccumulatedDeltaRangeUncertaintyMeters()).isEqualTo(1902.9177342976868);
        assertThat(itsGoogleRawGnssMeasurement.hasCarrierFrequencyHz()).isTrue();
        assertThat(itsGoogleRawGnssMeasurement.getCarrierFrequencyHz()).isEqualTo(1.57542003E9);
        assertThat(itsGoogleRawGnssMeasurement.hasCarrierCycles()).isFalse();
        assertThat(itsGoogleRawGnssMeasurement.hasCarrierPhase()).isFalse();
        assertThat(itsGoogleRawGnssMeasurement.hasCarrierPhaseUncertainty()).isFalse();
        assertThat(itsGoogleRawGnssMeasurement.getMultipathIndicator()).isEqualTo(0);
        assertThat(itsGoogleRawGnssMeasurement.hasSnrInDb()).isFalse();
        assertThat(itsGoogleRawGnssMeasurement.hasAgcDb()).isTrue();
        assertThat(itsGoogleRawGnssMeasurement.getAgcDb()).isEqualTo(-2.11);
        assertThat(itsGoogleRawGnssMeasurement.hasBasebandCn0DbHz()).isTrue();
        assertThat(itsGoogleRawGnssMeasurement.getBasebandCn0DbHz()).isEqualTo(31.9);
        assertThat(itsGoogleRawGnssMeasurement.hasFullInterSignalBiasNanos()).isTrue();
        assertThat(itsGoogleRawGnssMeasurement.getFullInterSignalBiasNanos()).isEqualTo(0.0);
        assertThat(itsGoogleRawGnssMeasurement.hasFullInterSignalBiasUncertaintyNanos()).isTrue();
        assertThat(itsGoogleRawGnssMeasurement.getFullInterSignalBiasUncertaintyNanos()).isEqualTo(0.0);
        assertThat(itsGoogleRawGnssMeasurement.hasSatelliteInterSignalBiasNanos()).isFalse();
        assertThat(itsGoogleRawGnssMeasurement.hasSatelliteInterSignalBiasUncertaintyNanos()).isFalse();
        assertThat(itsGoogleRawGnssMeasurement.hasCodeType()).isTrue();
        assertThat(itsGoogleRawGnssMeasurement.getCodeType()).isEqualTo("C");
        assertThat(itsGoogleRawGnssMeasurement.hasChipsetElapsedRealtimeNanos()).isTrue();
        assertThat(itsGoogleRawGnssMeasurement.getChipsetElapsedRealtimeNanos()).isEqualTo(313851404442744L);
        assertThat(itsGoogleRawGnssMeasurement.hasConstellationType()).isTrue();
        assertThat(itsGoogleRawGnssMeasurement.getConstellationType()).isEqualTo(1);
        assertThat(itsGoogleRawGnssMeasurement.hasMultipathIndicator()).isTrue();
        assertThat(itsGoogleRawGnssMeasurement.getMultipathIndicator()).isEqualTo(0);
    }

    public void collect(GoogleGnssLoggerRecord record) {
        record.accept(this);
    }

    public void visit(GoogleRawGnssMeasurement googleRawGnssMeasurement) {
        itsGoogleRawGnssMeasurement = googleRawGnssMeasurement;
    }
}