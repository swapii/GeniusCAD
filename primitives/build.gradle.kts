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
    testImplementation("com.winterbe:expekt:0.5.0")
    testRuntimeOnly("org.spekframework.spek2:spek-runner-junit5:2.0.10")

    testRuntimeOnly("org.jetbrains.kotlin:kotlin-reflect:1.3.72")

}
