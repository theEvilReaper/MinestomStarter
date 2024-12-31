rootProject.name = "MinestomStarter"

dependencyResolutionManagement {
    repositories {
        mavenCentral()
    }

    versionCatalogs {
        create("libs") {
            library("microtus", "net.onelitefeather.microtus", "Microtus").version("1.5.0")
        }
    }
}
