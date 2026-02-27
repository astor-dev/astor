import org.jetbrains.kotlin.gradle.plugin.KotlinJsCompilerType

plugins {
    id("org.jetbrains.kotlin.multiplatform")
}

kotlin {
    js(KotlinJsCompilerType.IR) {
        browser {
            commonWebpackConfig {
                cssSupport {
                    enabled.set(true)
                }
            }
        }
        binaries.executable()
    }
}
