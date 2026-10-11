// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    alias(libs.plugins.android.application) apply false
    alias(libs.plugins.kotlin.compose) apply false
}
extra.set("kotlin_version", "1.8.0")
extra.set("compileSdk", 34)
extra.set("minSdk", 29)
extra.set("targetSdk", 34)