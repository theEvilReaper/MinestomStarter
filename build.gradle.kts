plugins {
    java
    id("com.github.johnrengelman.shadow") version "7.1.2"
}

java {
    toolchain {
        languageVersion.set(JavaLanguageVersion.of(17))
    }
}

repositories {
    mavenCentral()
    maven("https://jitpack.io")
}

val minestomVersion = "master-SNAPSHOT"

dependencies {
    implementation("com.github.Minestom:Minestom:$minestomVersion")
}

tasks {

    compileJava {
        options.encoding = "UTF-8"
    }

    jar {
        archiveFileName.set("${rootProject.name}.${archiveExtension.getOrElse("jar")}")

        dependsOn("shadowJar")

        manifest {
            attributes(mapOf("Main-Class" to "net.theEvilReaper.minestom.Start"))
        }
    }
}
