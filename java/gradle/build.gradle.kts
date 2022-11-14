﻿rootProject.name = 'manifest-gradle-kts'
version = "0.1"

plugins {
    id("demo.kotlin-application-conventions")
}

dependencies {
    implementation("org.apache.commons:commons-text:1.9")
    implementation("org.apache.logging.log4j:log4j-core:2.18.0")
    testImplementation("junit:junit:4.+")
}

application {
    mainClass.set("demo.app.AppKt")
}