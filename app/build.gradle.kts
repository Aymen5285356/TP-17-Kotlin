plugins {
    alias(libs.plugins.android.application)
}

android {
    namespace = "com.example.businessapp"
    compileSdk {
        version = release(37)
        compileSdk = rootProject.extra["compileSdk"] as Int
    }

    defaultConfig {
        applicationId = "com.example.businessapp"
        minSdk = 29
        targetSdk = 37
        versionCode = 1
        versionName = "1.0"
        minSdk = rootProject.extra["minSdk"] as Int
        targetSdk = rootProject.extra["targetSdk"] as Int
        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            optimization {
                enable = false
            }
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
}

dependencies {
    implementation(libs.androidx.activity.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.androidx.constraintlayout)
    implementation(libs.androidx.core.ktx)
    implementation(libs.material)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.espresso.core)
    androidTestImplementation(libs.androidx.junit)
    implementation(project(":data"))
    implementation(project(":domain"))
}