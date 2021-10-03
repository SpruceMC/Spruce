import org.spongepowered.gradle.vanilla.repository.MinecraftPlatform

plugins {
    kotlin("jvm") version "1.5.31"
    id("org.spongepowered.gradle.vanilla") version "0.2"

    `java-library`
}

group = "xyz.qalcyo"
version = "0.1"

minecraft {
    version("1.17.1")
    platform(MinecraftPlatform.JOINED)

    runs {
        client("Run Client") {
            mainClass("xyz.qalcyo.spruce.loader.SpruceLoaderKt")
        }
    }
}

repositories {
    mavenCentral()
}

dependencies {
    implementation(kotlin("stdlib"))
}