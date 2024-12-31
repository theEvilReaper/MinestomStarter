plugins {
    java
    id("com.gradleup.shadow") version "9.0.0-beta4"
}

java {
    toolchain {
        languageVersion.set(JavaLanguageVersion.of(21))
    }
}

dependencies {
    implementation(libs.microtus)
}

tasks {
    compileJava {
        options.encoding = "UTF-8"
        options.release = 21
    }

    jar {
        archiveFileName.set("${rootProject.name}.${archiveExtension.getOrElse("jar")}")

        dependsOn("shadowJar")

        manifest {
            attributes(mapOf("Main-Class" to "net.theEvilReaper.minestom.Start"))
        }
    }
}
