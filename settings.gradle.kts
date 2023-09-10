
rootProject.name = "otus-homeworks"
include("homework-1-hello")
pluginManagement {
    val kotlinVersion: String by settings
    plugins {
        kotlin("jvm") version kotlinVersion apply false
    }
}