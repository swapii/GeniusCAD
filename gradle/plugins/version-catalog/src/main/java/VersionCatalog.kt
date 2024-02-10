import org.gradle.api.initialization.dsl.VersionCatalogBuilder

internal fun VersionCatalogBuilder.versionCatalog() {

    version("kotlin", "1.9.22")

    plugin("kotlin.jvm", "org.jetbrains.kotlin.jvm").apply {
        versionRef("kotlin")
    }

    version("spek", "2.0.10")

    library("spek.dsl.jvm", "org.spekframework.spek2", "spek-dsl-jvm").versionRef("spek")
    library("spek.runner.junit5", "org.spekframework.spek2", "spek-runner-junit5").versionRef("spek")

    library("atrium.fluent.en_GB", "ch.tutteli.atrium:atrium-fluent-en_GB:0.12.0")

}
