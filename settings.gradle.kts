pluginManagement {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}

@Suppress("UnstableApiUsage")
dependencyResolutionManagement {
    repositories {
        google()
        mavenCentral()
    }
}

rootProject.name = "astor"

includeBuild("build-logic")

include("monolith-api")

include("orang:orang-domain")
include("orang:orang-common")
include("orang:orang-use-case")
include("orang:orang-android")

include("portfolio:portfolio-domain")
include("portfolio:portfolio-common")
include("portfolio:portfolio-use-case")
include("portfolio:portfolio-web")