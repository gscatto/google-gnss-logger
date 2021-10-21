# [1.0.0-alpha.2](https://github.com/giulioscattolin/google-gnss-logger/compare/v1.0.0-alpha.1...v1.0.0-alpha.2) (2021-10-21)


### Bug Fixes

* **build:** "build.gradle" was "gradle.build" ([7c5e5a4](https://github.com/giulioscattolin/google-gnss-logger/commit/7c5e5a42f927f07875ec5ea3b207c4d30f6f1255))

# 1.0.0-alpha.1 (2021-10-21)


### Bug Fixes

* **build:** forgot to check out code ([b1e35d2](https://github.com/giulioscattolin/google-gnss-logger/commit/b1e35d2eab5e878c1f511f80dbfd11e7e8431440))
* remove trailing dot in package name ([7d80797](https://github.com/giulioscattolin/google-gnss-logger/commit/7d80797904f3f6e42e360c578dddee0aa6a55356))


### Features

* add AnalyzeGnssLoggerFileUseCase ([154711d](https://github.com/giulioscattolin/google-gnss-logger/commit/154711d8a9e67fb93295a59b98c75c94d0142e89))
* add EagerGoogleRawGnssMeasurementLineAdapter ([414e3d6](https://github.com/giulioscattolin/google-gnss-logger/commit/414e3d68d8f52f6a6adc081af71df06a8670c089))
* add EagerGoogleRawGnssMeasurementLineReader ([3480354](https://github.com/giulioscattolin/google-gnss-logger/commit/3480354ee5127c473ff55929e62c770b6cc98721))
* add RawGoogleGnssLoggerRecord ([e6b4b1f](https://github.com/giulioscattolin/google-gnss-logger/commit/e6b4b1fe1ed2bc69dc221041b7c8b4bdb3d8dffe))
* remove magic constants ([9896c3d](https://github.com/giulioscattolin/google-gnss-logger/commit/9896c3d721968dc8cc33f9018f13950d15218605))
* rename RawGnssMeasurement to GoogleRawGnssMeasurement ([a000809](https://github.com/giulioscattolin/google-gnss-logger/commit/a0008095c968f8d108193cb33ab7693292e1796c))
* rename RawGoogleGnssLoggerRecord to RawGnssMeasurement ([e99833e](https://github.com/giulioscattolin/google-gnss-logger/commit/e99833ef70da818dc27236ec146b30ab86376eb0))


### BREAKING CHANGES

* remove RawGnssMeasurement
* remove RawGoogleGnssLoggerRecord
* remove hasState(), getState(), doesStateMatch(), hasAccumulatedDeltaRangeState(), getAccumulatedDeltaRangeState(), hasMultipathIndicator(), getMultipathIndicator(), hasConstellationType(), getConstellationType(), ConstellationType and State
