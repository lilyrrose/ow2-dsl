plugins {
    kotlin("jvm") version "2.0.0"
}

group = "pm.lily"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    api("org.ow2.asm:asm:9.7")
    api("org.ow2.asm:asm-tree:9.7")
    api("org.ow2.asm:asm-commons:9.7")
    testImplementation(kotlin("test"))
}

tasks.test {
    useJUnitPlatform()
}