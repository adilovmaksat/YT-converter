object Dependecies {
    object AndroidCore {
        const val ANDROID_X_CORE = "androidx.core:core-ktx:${Versions.ANDROID_X_CORE_VERSION}"
    }
    object Compose {
        const val COMPOSE_UI = "androidx.compose.ui:ui:${Versions.COMPOSE_VERSION}"
        const val COMPOSE_MATERIAL =
            "androidx.compose.material:material:${Versions.COMPOSE_VERSION}"
        const val COMPOSE_PREVIEW_TOOL =
            "androidx.compose.ui:ui-tooling-preview:${Versions.COMPOSE_VERSION}"
        const val COMPOSE_ACTIVITY =
            "androidx.activity:activity-compose:${Versions.COMPOSE_ACTIVITY_VERSION}"
        const val COMPOSE_MANIFEST = "androidx.compose.ui:ui-test-manifest:${Versions.COMPOSE_VERSION}"
        const val COMPOSE_TOOLING = "androidx.compose.ui:ui-tooling:${Versions.COMPOSE_VERSION}"
    }
    object TestUtils {
        const val ANDROID_JUNIT_RUNNER = "androidx.test.runner.AndroidJUnitRunner"
        const val JUNIT = "junit:junit:${Versions.JUNIT_VERSION}"
        const val COMPOSE_UI_JUNIT = "androidx.compose.ui:ui-test-junit4:${Versions.COMPOSE_VERSION}"
        const val JUNIT_EXT = "androidx.test.ext:junit:1.1.3:${Versions.JUNIT_EXTENSION_VERSION}"
        const val ESPRESSO = "androidx.test.espresso:espresso-core:${Versions.ESPRESSO_VERSION}"
    }
    object Lifecycle {
        const val LIFECYCLE_EXTENSION =
            "androidx.lifecycle:lifecycle-runtime-ktx:${Versions.LIFECYCLE_EXTENSION_VERSION}"
    }

    object Architecture {
        const val ORBIT_MVI_VIEWMODEL = "org.orbit-mvi:orbit-core:${Versions.ORBIT_MVI_VERSION}"
        const val ORBIT_MVI_CORE = "org.orbit-mvi:orbit-viewmodel:${Versions.ORBIT_MVI_VERSION}"

    }


}