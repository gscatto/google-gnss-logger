# google-gnss-logger 
This library facilitates reading, writing and processing of sensor events and raw GNSS measurements encoded according to the Google's [GNSS Logger](https://play.google.com/store/apps/details?id=com.google.android.apps.location.gps.gnsslogger) application format.
* Stunningly easy to use
* Enables developing algorithms for Android devices
* Does not depend on the Android API
* Provides parsing strategies according to different desired behavior

![CI badge](https://github.com/giulioscattolin/google-gnss-logger/actions/workflows/gradle.yml/badge.svg)
![JitPack badge](https://jitpack.io/v/giulioscattolin/google-gnss-logger.svg)

## Installation
    
### Gradle (Groovy)
```groovy
repositories {
    maven { url 'https://jitpack.io' }
}

dependencies {
    implementation 'com.github.giulioscattolin:google-gnss-logger:1.0.0-alpha.2'
}
```

## Demo
The [demo](/src/main/java/com/github/giulioscattolin/demo) directory contains an example that shows how this library may be used in a realistic scenario.  The [AnalyzeGnssLoggerFileUseCase](/src/main/java/com/github/giulioscattolin/demo/AnalyzeGnssLoggerFileUseCase.java)  reads a file, tells how many raw GNSS measurements have been encountered, groups them by constellation and carrier frequency and then reports some statistics for each pair.

_Usage:_
```shell
./gradlew analyzeGnssLoggerFile --args <path>
```

_Example output:_
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