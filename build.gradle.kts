buildscript {
    extra.set("compose_version", Versions.COMPOSE_VERSION)
}

plugins {
    id("com.android.application") version Versions.ANDROID_APPLICATION_VERSION apply false
    id("com.android.library") version Versions.ANDROID_APPLICATION_VERSION apply false
    id("org.jetbrains.kotlin.android") version Versions.KOTLIN_VERSION apply false
}

tasks.register("clean",Delete::class){
    delete(rootProject.buildDir)
}