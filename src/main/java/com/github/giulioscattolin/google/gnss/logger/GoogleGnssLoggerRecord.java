package com.github.giulioscattolin.google.gnss.logger;

/**
 * Abstracts data logged by Google's <a href="https://play.google.com/store/apps/details?id=com.google.android.apps.location.gps.gnsslogger">GNSS Logger</a> Android application.
 */
public interface GoogleGnssLoggerRecord {
    void accept(GoogleGnssLoggerRecordVisitor visitor);
}
