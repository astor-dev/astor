plugins {
    id("astor.jvm.spring")
}

dependencies {
    implementation(project(":orang:orang-common"))
    implementation(project(":orang:orang-domain"))
    implementation(project(":orang:orang-use-case"))

    implementation(project(":portfolio:portfolio-common"))
    implementation(project(":portfolio:portfolio-domain"))
    implementation(project(":portfolio:portfolio-use-case"))
}