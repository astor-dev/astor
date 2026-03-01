plugins {
    id("astor.kmp.android")
    id("astor.kmp.spring")
}

kotlin {
    sourceSets {
        jvmMain {
            dependencies {
                implementation(project(":orang:orang-common"))
                implementation(project(":orang:orang-domain"))

                implementation(project.dependencies.platform(libs.spring.boot.dependencies))
            }
        }
    }
}