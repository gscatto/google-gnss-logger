package com.github.giulioscattolin.google.gnss.logger;

/**
 * Provides a simplified interface to a {@link GoogleGnssLoggerRecordLineReader} implementation.
 *
 * By default, this line reader does not emit any data. Users must configure it setting a line reader
 * implementation for each record type using {@link #with(GoogleGnssLoggerRecordLineReader)}.
 */
public class ConfigurableGoogleGnssLoggerRecordLineReader implements GoogleGnssLoggerRecordLineReaderVisitor {
    private GoogleRawGnssMeasurementLineReader itsGoogleRawGnssMeasurementLineReader = new NullGoogleRawGnssMeasurementLineReader();

    /**
     * Configures this reader to use the given implementation, then returns itself.
     */
    public ConfigurableGoogleGnssLoggerRecordLineReader with(GoogleGnssLoggerRecordLineReader reader) {
        reader.accept(this);
        return this;
    }

    public void visit(GoogleRawGnssMeasurementLineReader googleRawGnssMeasurementLineReader) {
        itsGoogleRawGnssMeasurementLineReader = googleRawGnssMeasurementLineReader;
    }

    public void readLine(String line) {
        new ReadLine(line);
    }

    class ReadLine {
        final String itsLine;

        public ReadLine(String line) {
            itsLine = line;
            readLine();
        }

        private void readLine() {
            if (!findHeader())
                findRecord();
        }

        private boolean findHeader() {
            return isHeader();
        }

        private boolean isHeader() {
            return itsLine.charAt(0) == '#';
        }

        private void findRecord() {
            int limit = itsLine.indexOf(',');
            if (limit == -1)
                return;
            String type = itsLine.substring(0, limit);
            switch (type) {
                case "Raw":
                    itsGoogleRawGnssMeasurementLineReader.readGoogleRawGnssMeasurement(itsLine);
                    return;
                case "UncalAccel":
                    return;
                case "UncalGyro":
                    return;
                case "UncalMag":
                    return;
                case "OrientationDeg":
                    return;
                case "Fix":
                    return;
                case "Nav":
                    return;
                case "Status":
                    return;
                default:
                    ;
            }
        }
    }
}
