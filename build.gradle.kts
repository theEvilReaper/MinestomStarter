plugins {
    java
    id ("com.github.johnrengelman.shadow") version "7.0.0"
}

java {
    toolchain {
        languageVersion.set(JavaLanguageVersion.of(17))
    }
}

tasks.jar {
    dependsOn("shadowJar")
    manifest {
        attributes(mapOf("Main-Class" to "net.theEvilReaper.minestom.Start"))
    }
}

repositories {
    mavenCentral()
    maven("https://jitpack.io")
}

dependencies {
    implementation("com.github.Minestom:Minestom:baca58daa6")
}