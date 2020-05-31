plugins {
    `java-library`
    kotlin("jvm")
}

tasks.withType<Test> {
    useJUnitPlatform {
        includeEngines("spek2")
    }
}

dependencies {

    api(kotlin("stdlib-jdk8"))

    testImplementation("org.spekframework.spek2:spek-dsl-jvm:2.0.10")
    testRuntimeOnly("org.spekframework.spek2:spek-runner-junit5:2.0.10")

    testImplementation("ch.tutteli.atrium:atrium-fluent-en_GB:0.12.0")

}
