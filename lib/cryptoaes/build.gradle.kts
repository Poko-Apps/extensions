plugins {
    id("com.android.library")
    kotlin("android")
}

android {
    compileSdk = AndroidConfig.compileSdk
    buildToolsVersion = AndroidConfig.buildToolVersion

    defaultConfig {
        minSdk = AndroidConfig.minSdk
    }

    namespace = "eu.kanade.tachiyomi.lib.cryptoaes"
}

repositories {
    mavenCentral()
}

dependencies {
    compileOnly(libs.kotlin.stdlib)
}
