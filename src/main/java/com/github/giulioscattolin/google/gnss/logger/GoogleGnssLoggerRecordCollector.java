package com.github.giulioscattolin.google.gnss.logger;

/**
 * Collects {@link GoogleGnssLoggerRecord}.
 */
public interface GoogleGnssLoggerRecordCollector {
    void collect(GoogleGnssLoggerRecord record);
}
