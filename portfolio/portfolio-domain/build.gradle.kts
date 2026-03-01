plugins {
    id("astor.kmp.js")
    id("astor.kmp.spring")
}

kotlin {
    sourceSets {
        jvmMain {
            dependencies {
                implementation(project(":portfolio:portfolio-common"))

                implementation(project.dependencies.platform(libs.spring.boot.dependencies))
            }
        }
    }
}