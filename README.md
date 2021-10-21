# google-gnss-logger 
This library facilitates reading, writing and processing of sensor events and raw GNSS measurements encoded according to the Google's [GNSS Logger](https://play.google.com/store/apps/details?id=com.google.android.apps.location.gps.gnsslogger) application format.
* Provides a reasonable level of abstraction on the aforementioned format
* Defines the usual `hasX()` and `getX()` accessor methods
* Fields are mapped to the most appropriate primitive type
* No need to wait for updates to consume new values of existing fields
* Offers different parsing strategies according to the desired performance 

![CI badge](https://github.com/giulioscattolin/google-gnss-logger/actions/workflows/gradle.yml/badge.svg)
![JitPack badge](https://jitpack.io/v/giulioscattolin/google-gnss-logger.svg)
[![Javadoc badge](https://img.shields.io/badge/Javadoc-1.0.0--alpha.4-brightgreen)](https://javadoc.jitpack.io/com/github/giulioscattolin/google-gnss-logger/1.0.0-alpha.4/javadoc/)

## Installation
    
### Gradle (Groovy)
```groovy
repositories {
    maven { url 'https://jitpack.io' }
}

dependencies {
    implementation 'com.github.giulioscattolin:google-gnss-logger:1.0.0-alpha.4'
}
```

## Try before you buy
The [demo](/src/main/java/com/github/giulioscattolin/google/gnss/logger/demo) directory contains a CLI application which reports simple statistics for a given file. You are encouraged to play with the code to familiarize yourself with the API. Feel free to improve the formatting, generate more data, fix any bugs you may encounter. Pull requests are always welcome!

### Usage
```shell
./gradlew analyzeGnssLoggerFile --args <path>
```
This will compile and run the application each time it is invoked.

### Example output
```text
GoogleRawGnssMeasurementCount = 218414
Constellation  Carrier [Hz]      Count    Avg.Cn0DbHz
      GLONASS      1,6037E9       1319          23,03
      GLONASS      1,6003E9       4243          36,28
      GLONASS      1,6048E9       2162          29,91
      GLONASS      1,6014E9       4128          27,69
      GLONASS      1,5981E9       1654          29,82
      GALILEO            E1      35816          29,68
       BEIDOU           B1I      36268          31,34
      GLONASS      1,6009E9       1798          30,80
      GLONASS      1,6042E9       4260          31,07
      GLONASS       1,602E9       4260          32,82
        IRNSS            L5      13803          27,92
          GPS            L1      34655          31,99
       BEIDOU           B2a      19386          31,04
      GALILEO           E5a      35425          31,02
      GLONASS      1,6031E9       1819          29,46
      GLONASS      1,5998E9        348          27,34
          GPS            L5      17070          32,17
```
