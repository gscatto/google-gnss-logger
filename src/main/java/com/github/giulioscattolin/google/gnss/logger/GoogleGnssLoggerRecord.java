package com.github.giulioscattolin.google.gnss.logger;

public interface GoogleGnssLoggerRecord {
    void accept(GoogleGnssLoggerRecordVisitor visitor);
}
