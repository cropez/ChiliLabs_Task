plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
}

android {
    namespace = "com.example.chililabs_task"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.chililabs_task"
        minSdk = 24
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }

        compileOptions {
            sourceCompatibility = JavaVersion.VERSION_1_8
            targetCompatibility = JavaVersion.VERSION_1_8
        }
        kotlinOptions {
            jvmTarget = "1.8"
        }
    }

    dependencies {
        implementation("androidx.core:core-ktx:1.9.0")
        implementation("androidx.appcompat:appcompat:1.6.1")
        implementation("com.google.android.material:material:1.10.0")
        testImplementation("junit:junit:4.13.2")
        androidTestImplementation("androidx.test.ext:junit:1.1.5")
        androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")
        implementation("androidx.lifecycle:lifecycle-viewmodel-ktx:2.3.1")
        implementation("androidx.lifecycle:lifecycle-livedata-ktx:2.3.1")
        implementation("androidx.paging:paging-runtime:3.0.1")
        implementation("com.squareup.retrofit2:retrofit:2.9.0")
        implementation("com.squareup.retrofit2:converter-gson:2.9.0")
        implementation("com.squareup.okhttp3:logging-interceptor:4.9.1")
        implementation("androidx.recyclerview:recyclerview:1.2.1")
        implementation("com.google.android.material:material:1.3.0")
        implementation("org.jetbrains.kotlinx:kotlinx-coroutines-android:1.5.2")
        implementation ("com.squareup.retrofit2:retrofit:2.9.0")
        implementation ("com.squareup.retrofit2:converter-gson:2.9.0")
        implementation ("com.google.dagger:dagger:2.38.1")
        implementation ("androidx.lifecycle:lifecycle-viewmodel-ktx:2.3.1")
        implementation ("androidx.lifecycle:lifecycle-livedata-ktx:2.3.1")
        implementation ("androidx.appcompat:appcompat:1.3.1")
        implementation ("com.google.android.material:material:1.4.0")
        implementation ("com.google.dagger:dagger-android:2.38.1")
        implementation ("com.google.dagger:dagger-android-support:2.38.1")
        implementation ("com.jakewharton.retrofit:retrofit2-kotlin-coroutines-experimental-adapter:1.0.0")
        implementation ("com.github.bumptech.glide:glide:4.12.0")
        annotationProcessor ("com.github.bumptech.glide:compiler:4.12.0")
    }
    }