import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

version = "1.0"

buildscript {
    repositories {
        mavenCentral()
    }

    dependencies {
        classpath(kotlin("gradle-plugin", version = "1.3.61"))
    }
}

repositories {
    mavenCentral()
}

plugins {
    kotlin("jvm") version "1.3.61"
    kotlin("kapt") version "1.3.61"
}

tasks.withType<JavaCompile> {
    sourceCompatibility = "1.8"
    options.encoding = "UTF-8"
}

// config JVM target to 1.8 for kotlin compilation tasks
tasks.withType<KotlinCompile>().configureEach {
    kotlinOptions.jvmTarget = "1.8"
}

dependencies {
    implementation(kotlin("stdlib"))

    implementation("io.micronaut:micronaut-inject:1.3.0")
    annotationProcessor("io.micronaut:micronaut-inject-java:1.3.0")
    kapt("io.micronaut:micronaut-inject-java:1.3.0")
    // TODO open issue
    // add testAnnotationProcessor doesn't help
    ////testAnnotationProcessor(Cfg.Libs.micronautInjectJava)
    kaptTest("io.micronaut:micronaut-inject-java:1.3.0")

    testImplementation("org.junit.jupiter:junit-jupiter:5.5.2")
}

tasks.test {
    useJUnitPlatform()
    testLogging {
        events("passed", "skipped", "failed")
    }
}
