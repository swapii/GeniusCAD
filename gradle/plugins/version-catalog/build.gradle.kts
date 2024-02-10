plugins {
    `java-gradle-plugin`
    id("org.jetbrains.kotlin.jvm") version "1.9.22"
}

gradlePlugin {
    plugins {
        create("plugin") {
            id = "project-version-catalog"
            implementationClass = "ProjectVersionCatalogPlugin"
        }
    }
}

dependencies {
    implementation(gradleApi())
}
