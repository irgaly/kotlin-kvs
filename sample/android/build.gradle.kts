plugins {
    id("build-logic.android.application")
    kotlin("plugin.serialization")
}

android {
    defaultConfig {
        applicationId = "net.irgaly.kkvs.sample"
        versionName = libs.versions.kkvs.get()
    }
}

dependencies {
    implementation(libs.androidx.appcompat)
    implementation(libs.androidx.material)
    implementation(libs.kotlinx.serialization)
    implementation(project(":kotlin-kvs"))
}
