package com.github.giulioscattolin;

public interface GoogleGnssLoggerRecord {
    void accept(GoogleGnssLoggerRecordVisitor visitor);
}
