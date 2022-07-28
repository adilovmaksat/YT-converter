plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
}

android {
    compileSdk = ConfigData.COMPILE_SDK_VERSION

    defaultConfig {
        applicationId = ConfigData.APPLICATION_ID
        minSdk = ConfigData.MIN_SDK_VERSION
        targetSdk = ConfigData.TARGET_SDK_VERSION
        versionCode = ConfigData.VERSION_CODE
        versionName = ConfigData.VERSION_NAME

        testInstrumentationRunner = Dependecies.TestUtils.ANDROID_JUNIT_RUNNER
        vectorDrawables {
            useSupportLibrary = true
        }
    }

    buildTypes {
        getByName(ConfigData.RELEASE_BUILD_TYPE) {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile(ConfigData.PROGUARD_OPTIMIZE_FILE_PATH), ConfigData.PROGUARD_RULES_PATH)
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = ConfigData.TARGET_JVM_VERSION
    }
    buildFeatures {
        compose = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = Versions.COMPOSE_VERSION
    }
    packagingOptions {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
        }
    }
}

dependencies {
    //Compose
    implementation(Dependecies.Compose.COMPOSE_UI)
    implementation(Dependecies.Compose.COMPOSE_MATERIAL)
    implementation(Dependecies.Compose.COMPOSE_PREVIEW_TOOL)
    implementation(Dependecies.Compose.COMPOSE_ACTIVITY)
    debugImplementation(Dependecies.Compose.COMPOSE_TOOLING)
    debugImplementation(Dependecies.Compose.COMPOSE_MANIFEST)

    //Architecture
    implementation(Dependecies.Architecture.ORBIT_MVI_VIEWMODEL)
    implementation(Dependecies.Architecture.ORBIT_MVI_CORE)

    //Android core
    implementation(Dependecies.AndroidCore.ANDROID_X_CORE)

    //Lifecycle
    implementation(Dependecies.Lifecycle.LIFECYCLE_EXTENSION)

    //Test utils
    androidTestImplementation(Dependecies.TestUtils.JUNIT_EXT)
    androidTestImplementation(Dependecies.TestUtils.ESPRESSO)
    androidTestImplementation(Dependecies.TestUtils.COMPOSE_UI_JUNIT)
    testImplementation(Dependecies.TestUtils.JUNIT)

}