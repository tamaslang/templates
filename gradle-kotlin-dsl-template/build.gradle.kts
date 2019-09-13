import com.adarshr.gradle.testlogger.theme.ThemeType

plugins {
    application
    kotlin("jvm") version "1.3.21"
    id("io.spring.dependency-management") version "1.0.6.RELEASE"
    id ("com.adarshr.test-logger") version "1.6.0"
}

application {
    mainClassName = "samples.HelloWorldKt"
}

val assertjVersion = "3.11.1"
val junitVersion = "5.3.2"

dependencyManagement {
    dependencies {
        dependencySet("org.junit.jupiter:$junitVersion") {
            entry("junit-jupiter-api")
            entry("junit-jupiter-params")
            entry("junit-jupiter-engine")
        }
    }
}

dependencies {
    compile(kotlin("stdlib"))

    testImplementation("org.junit.jupiter:junit-jupiter-api")
    testImplementation("org.junit.jupiter:junit-jupiter-params")

    testImplementation("org.assertj:assertj-core:$assertjVersion")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine")
}

repositories {
    jcenter()
}
tasks {
    test {
        useJUnitPlatform()
    }

    testlogger {
        theme = ThemeType.MOCHA
        showStandardStreams = true
        showExceptions = true
        slowThreshold = 500
        showSummary = true
        showPassed = true
        showSkipped = true
        showFailed = true
        showStandardStreams = true
        showPassedStandardStreams = true
        showSkippedStandardStreams = true
        showFailedStandardStreams = true
    }
}