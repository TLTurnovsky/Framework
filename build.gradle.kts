buildscript {
    extra["compose_version"] = "1.2.1"
}
// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    alias(libs.plugins.android.application) apply false
    alias(libs.plugins.jetbrains.kotlin.android) apply false
    alias(libs.plugins.google.android.libraries.mapsplatform.secrets.gradle.plugin) apply false
}

tasks.register<Delete>("clean") {
    delete(rootProject.buildDir)
}