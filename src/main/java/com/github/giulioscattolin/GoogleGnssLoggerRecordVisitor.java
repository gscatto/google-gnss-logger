package com.github.giulioscattolin;

public interface GoogleGnssLoggerRecordVisitor {
    default void visit(RawGnssMeasurement rawGnssMeasurement) {
    }
}
