dependencies {
    implementation(project(":common"))

    compileOnly(libs.jetanno)
    compileOnly(libs.spigot)
    compileOnly(libs.packeteventsSpigot)
}

tasks.processResources {
    from(project(":common").file("src/main/resources"))
    filteringCharset = "UTF-8"

    filesMatching("**/*.yml") {
        expand(
            "project-version" to project.version,
            "paper-api-version" to rootProject.property("paperApiVersion"),
            "project-authors" to rootProject.property("authors"),
            "project-group" to project.group,
            "project-type" to project.name,
            "project-name" to rootProject.property("displayName")
        )
    }
}

