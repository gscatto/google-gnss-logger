package com.github.giulioscattolin;

import com.github.giulioscattolin.RawGoogleGnssLoggerRecord.ConstellationType;
import org.junit.Test;

import static com.github.giulioscattolin.RawGoogleGnssLoggerRecord.ConstellationType.*;
import static com.google.common.truth.Truth.assertThat;

public class RawGoogleGnssLoggerRecordTest {
    @Test
    public void testConstellationTypeValues() {
        assertThat(BEIDOU).isEqualTo(5);
        assertThat(GALILEO).isEqualTo(6);
        assertThat(GLONASS).isEqualTo(3);
        assertThat(GPS).isEqualTo(1);
        assertThat(IRNSS).isEqualTo(7);
        assertThat(QZSS).isEqualTo(4);
        assertThat(SBAS).isEqualTo(2);
        assertThat(UNKNOWN).isEqualTo(0);
    }
    @Test
    public void testToMacroCase() {
        assertThat(toMacroCase(BEIDOU)).isEqualTo("BEIDOU");
        assertThat(toMacroCase(GALILEO)).isEqualTo("GALILEO");
        assertThat(toMacroCase(GLONASS)).isEqualTo("GLONASS");
        assertThat(toMacroCase(GPS)).isEqualTo("GPS");
        assertThat(toMacroCase(IRNSS)).isEqualTo("IRNSS");
        assertThat(toMacroCase(QZSS)).isEqualTo("QZSS");
        assertThat(toMacroCase(SBAS)).isEqualTo("SBAS");
        assertThat(toMacroCase(UNKNOWN)).isEqualTo("UNKNOWN");
        assertThat(toMacroCase(-1)).isEqualTo("?");
    }
}