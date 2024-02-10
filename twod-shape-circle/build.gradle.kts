plugins {
    `java-library`
    alias(libs.plugins.kotlin.jvm)
}

tasks.withType<Test> {
    useJUnitPlatform {
        includeEngines("spek2")
    }
}

dependencies {

    api(project(":twod-primitive"))

    implementation(projects.common)

    testImplementation(libs.spek.dsl.jvm)
    testRuntimeOnly(libs.spek.runner.junit5)

    testImplementation(libs.atrium.fluent.en.gb)

}
