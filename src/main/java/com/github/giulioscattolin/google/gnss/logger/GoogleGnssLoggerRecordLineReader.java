package com.github.giulioscattolin.google.gnss.logger;

/**
 * Abstracts line readers that emit {@link GoogleGnssLoggerRecord} instances.
 */
public interface GoogleGnssLoggerRecordLineReader {
    void accept(GoogleGnssLoggerRecordLineReaderVisitor visitor);
}
