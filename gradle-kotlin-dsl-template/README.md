# Sample Kotlin Gradle project

Basic hello world application using Kotlin, Gradle
- Gradle configuration in Kotlin DSL
- Added better visualisation of the test execution's output
- Added dependency management


## Prerequisites
- Java 8 or above but developed in Kotlin
- Gradle 5 (for Kotlin DSL support)

## IntelliJ Configuration

### Set up the project (using IntelliJ IDEA)
1. Start IntelliJ IDEA.
1. From the File menu select 'New' and then 'Project from existing sources'.
1. Navigate to the root directory of the project and click 'Open'.
1. If not already chosen, select 'Import project from external model' and choose Gradle - then click 'Next'.
1. Tick the box next to 'Use auto-import' and click 'Finish'.

This last step ensures that when dependencies are changed in `build.gradle.kts`, IntelliJ will automatically update the project.

### Set up the code style

This ensures that we all have the same formatting rules (especially the line length and import settings, which match our detekt configuration):

1. Open IntelliJ's preferences dialogue.
1. Expand 'Editor' and click on 'Code Style'.
1. On the right of the 'Scheme' selected click on the cog.
1. Choose 'Import Scheme' and then 'IntelliJ IDEA code style XML'.
1. Browse to the 'intellij' directory and double click on `KotlinCodeStyle.xml`.
1. In the Import Scheme dialogue tick the box next to 'Current scheme' and then click 'OK'.
1. Click the 'Ok' or 'Apply' button.


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

## Build extensions

### Spring Dependency

Allows grouped versions of dependencies to be defined, so that dependencies do not have to redefine/repeat version 
numbers.

[Spring Dependency Plugin documentation](https://docs.spring.io/dependency-management-plugin/docs/current/reference/html/)


### Detekt

Runs static code analysis (and formatting) to provide basic code quality assurance.

```bash
./gradlew detekt
```


[Detekt Plugin documentation](https://arturbosch.github.io/detekt/kotlindsl.html) 
 