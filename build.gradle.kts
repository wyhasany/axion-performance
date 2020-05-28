plugins {
    java
    id("pl.allegro.tech.build.axion-release") version "1.11.0"
}

scmVersion {
    tag.prefix = "prefix"
}

group = "pl.wyhasany"
version = scmVersion.version

dependencies {
}
