plugins {
    id("astor.kmp.jvm")
    id("org.jetbrains.kotlin.plugin.spring")
}


kotlin {
    sourceSets {
        jvmMain {
            dependencies {
                implementation("org.springframework:spring-context")
            }
        }
    }
}