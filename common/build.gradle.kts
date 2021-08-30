plugins {
    java
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
    maven("https://repo.glaremasters.me/repository/concuncan/")
}

dependencies {
    implementation("com.flowpowered:flow-nbt:2.0.0")
}