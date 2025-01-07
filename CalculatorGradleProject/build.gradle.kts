plugins {
    id("java")
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
   // aggregator - includes the 3 dependencies below
   testImplementation("org.junit.jupiter:junit-jupiter:5.11.4")
   // testImplementation("org.junit.jupiter:junit-jupiter-api:5.11.4")
   // testImplementation("org.junit.jupiter:junit-jupiter-params:5.11.4")
   // testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:5.11.4")
}

tasks.test {
    useJUnitPlatform()
    // I included the configuration below to display
    // err e out messages in the console
    testLogging.showStandardStreams = true
}