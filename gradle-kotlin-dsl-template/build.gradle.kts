import com.adarshr.gradle.testlogger.theme.ThemeType
import io.gitlab.arturbosch.detekt.detekt

plugins {
    application
    kotlin("jvm") version "1.3.72"
    id("io.spring.dependency-management") version "1.0.9.RELEASE"
    id ("com.adarshr.test-logger") version "2.0.0"
    id ("io.gitlab.arturbosch.detekt") version "1.5.0"
}

application {
    mainClassName = "samples.HelloWorldKt"
}

val assertjVersion = "3.15.0"
val junitVersion = "5.3.2"
val detektVersion = "1.0.1"
val junitVintageVersion = "4.12"

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

    testCompileOnly("junit:junit:$junitVintageVersion")


    testImplementation("org.junit.jupiter:junit-jupiter-api")
    testImplementation("org.junit.jupiter:junit-jupiter-params")

    testImplementation("org.assertj:assertj-core:$assertjVersion")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine")
    testRuntimeOnly("org.junit.vintage:junit-vintage-engine:$junitVersion")
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


detekt {
    toolVersion = detektVersion
    input = files("src/main/kotlin")
    config = files("detekt-config.yml")
}

