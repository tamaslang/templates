# Sample Kotlin Gradle project

Basic hello world application using Kotlin, Gradle
- Gradle configuration in Kotlin DSL
- Added better visualisation of the test execution's output
- Added dependency management


## Prerequisites
- Java 8 or above but developed in Kotlin
- Gradle 5 (for Kotlin DSL support)

### Set up the project (using IntelliJ IDEA)
1. Start IntelliJ IDEA.
1. From the File menu select 'New' and then 'Project from existing sources'.
1. Navigate to the root directory of the project and click 'Open'.
1. If not already chosen, select 'Import project from external model' and choose Gradle - then click 'Next'.
1. Tick the box next to 'Use auto-import' and click 'Finish'.

This last step ensures that when dependencies are changed in `build.gradle.kts`, IntelliJ will automatically update the project.

## Run unit tests

```bash
./gradlew test
```

## Build 

```bash
./gradlew build
```

## Run

```bash
./gradlew run
```
 