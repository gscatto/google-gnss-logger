package com.github.giulioscattolin.google.gnss.logger;

/**
 * Visits {@link GoogleGnssLoggerRecordLineReader} sub-types.
 */
public interface GoogleGnssLoggerRecordLineReaderVisitor {
    void visit(GoogleRawGnssMeasurementLineReader googleRawGnssMeasurementLineReader);
}
