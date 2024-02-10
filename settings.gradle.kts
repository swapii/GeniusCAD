pluginManagement {

    repositories {
        mavenCentral()
    }

    includeBuild("gradle/plugins/version-catalog")

}

dependencyResolutionManagement {

    repositories {
        google()
        mavenCentral()
    }

}

plugins {
    id("project-version-catalog")
}

include(":common")
include(":twod-primitive")
include(":twod-shape-circle")

enableFeaturePreview("TYPESAFE_PROJECT_ACCESSORS")
