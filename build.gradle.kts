plugins {
    `java-library`
    `maven-publish`
    id("io.freefair.lombok") version "6.4.3"
}

buildscript {

}

repositories {
    mavenLocal()
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
    toolchain {
        languageVersion.set(JavaLanguageVersion.of(11))
    }

}

publishing {
    publications {
        create<MavenPublication>("maven") {
            groupId = "per.nonlone"
            artifactId = "vertebra"
            version = "1.0"
            from(components["java"])
        }
    }
}

