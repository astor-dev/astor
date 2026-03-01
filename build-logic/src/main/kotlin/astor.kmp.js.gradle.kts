import org.jetbrains.kotlin.gradle.plugin.KotlinJsCompilerType

plugins {
    id("astor.kmp")
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
