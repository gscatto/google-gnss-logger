package com.github.giulioscattolin.google.gnss.logger;

/**
 * Visits {@link GoogleGnssLoggerRecord}.
 */
public interface GoogleGnssLoggerRecordVisitor {
    default void visit(GoogleRawGnssMeasurement googleRawGnssMeasurement) {
    }
}
