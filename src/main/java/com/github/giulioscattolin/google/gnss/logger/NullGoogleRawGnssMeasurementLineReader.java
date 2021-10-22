package com.github.giulioscattolin.google.gnss.logger;

/**
 * A {@link GoogleRawGnssMeasurementLineReader} which does nothing.
 */
public class NullGoogleRawGnssMeasurementLineReader extends GoogleRawGnssMeasurementLineReader {
    public void readGoogleRawGnssMeasurement(String line) {
    }
}
