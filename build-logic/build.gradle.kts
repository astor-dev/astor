plugins {
    `kotlin-dsl`
}

dependencies {
    implementation(libs.agp.gradle.plugin)
    implementation(libs.kotlin.gradle.plugin)
    implementation("org.jetbrains.kotlin:kotlin-serialization")
    implementation(libs.spring.boot.gradle.plugin)
    implementation(libs.kotlin.allopen.plugin)
    implementation(libs.kotlin.noarg.plugin)
}

kotlin {
    jvmToolchain(25)
}