import org.gradle.api.Plugin
import org.gradle.api.initialization.Settings

class ProjectVersionCatalogPlugin : Plugin<Settings> {

    override fun apply(target: Settings) {
        target.run {
            dependencyResolutionManagement.apply {
                versionCatalogs.apply {
                    create("libs").apply {
                        versionCatalog()
                    }
                }
            }
        }
    }

}
