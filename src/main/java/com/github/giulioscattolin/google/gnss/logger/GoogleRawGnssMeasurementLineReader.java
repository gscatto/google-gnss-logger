package com.github.giulioscattolin.google.gnss.logger;

/**
 * A line reader that emits {@link GoogleRawGnssMeasurement} instances.
 */
public abstract class GoogleRawGnssMeasurementLineReader implements GoogleGnssLoggerRecordLineReader {
    /**
     * Parses the given line as {@link GoogleRawGnssMeasurement}.
     */
    public abstract void readGoogleRawGnssMeasurement(String line);

    public void accept(GoogleGnssLoggerRecordLineReaderVisitor visitor) {
        visitor.visit(this);
    }
}
