buildscript {

    repositories {
        mavenCentral()
    }

}

plugins {
    kotlin("jvm") version "1.9.22" apply false
}

allprojects {

    repositories {
        mavenCentral()
    }

}

tasks.named<Wrapper>("wrapper") {
    distributionType = Wrapper.DistributionType.ALL
}
