
plugins {
    id("astor.kmp.android")
    id("astor.kmp.spring")
    alias(libs.plugins.kotlin.jpa)
}

kotlin {
    androidLibrary {
        namespace = "com.astor.orang.domain"
    }
}

kotlin {
    sourceSets {
        jvmMain {
            dependencies {
                implementation(project(":orang:orang-common"))

                implementation(project.dependencies.platform(libs.spring.boot.dependencies))
                implementation("org.springframework.boot:spring-boot-starter-data-jpa")
            }
        }
    }
}