plugins {
    `java-library`
    id("io.freefair.lombok") version "6.4.3"
}

buildscript {


}

repositories {
    mavenCentral()
}

dependencies {

    ext {
        set("versionHuToolAll","5.7.6")
        set("versionGuava","30.1.1-jre")
    }

    implementation("cn.hutool:hutool-all:${ext.get("versionHuToolAll")}")
    implementation("com.google.guava:guava:${ext.get("versionGuava")}")
}

java {
    withSourcesJar()
}