plugins {
    id("astor.kmp.spring")
    alias(libs.plugins.spring.boot)
}

kotlin {
    sourceSets {
        jvmMain {
            dependencies {
                implementation(project(":orang:orang-common"))
                implementation(project(":orang:orang-domain"))
                implementation(project(":orang:orang-use-case"))
                implementation(project.dependencies.platform(libs.spring.boot.dependencies))

                implementation(project(":portfolio:portfolio-common"))
                implementation(project(":portfolio:portfolio-domain"))
                implementation(project(":portfolio:portfolio-use-case"))
                implementation("org.springframework.boot:spring-boot-starter-web")
            }
        }
    }
}
