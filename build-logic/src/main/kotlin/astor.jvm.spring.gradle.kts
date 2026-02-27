plugins {
    id("org.jetbrains.kotlin.jvm")
    id("io.spring.dependency-management")
    id("org.jetbrains.kotlin.plugin.spring")
    id("org.jetbrains.kotlin.plugin.jpa")
}

kotlin {
    jvmToolchain(25)
}