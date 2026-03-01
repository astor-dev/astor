plugins {
    id("astor.kmp")
    id("com.android.kotlin.multiplatform.library")
}

kotlin {
    androidLibrary {
        namespace = "com.orang.common"
        compileSdk = 35
    }

}