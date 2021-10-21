package com.github.giulioscattolin.google.gnss.logger;

public interface GoogleGnssLoggerRecordVisitor {
    default void visit(GoogleRawGnssMeasurement googleRawGnssMeasurement) {
    }
}
