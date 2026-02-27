plugins {
    id("org.jetbrains.kotlin.multiplatform")
    id("org.jetbrains.kotlin.plugin.serialization")
}

kotlin {
    jvmToolchain(25)
}

kotlin {
    jvm()
    sourceSets {
        commonMain.dependencies {
//            implementation(libs.kotlinx.serialization.json)
        }
    }
}
