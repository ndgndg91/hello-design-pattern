plugins {
    kotlin("jvm") version "1.9.22"
}

group = "com.ndgndg91"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test"))
}

tasks.test {
    useJUnitPlatform()
}
kotlin {
    jvmToolchain(21)
}