dependencies {
    implementation(project(":common"))

    compileOnly(libs.jetanno)
    compileOnly(libs.bungee)
}

tasks.processResources {
    from(project(":common").file("src/main/resources"))
    filteringCharset = "UTF-8"

    filesMatching("**/*.yml") {
        expand(
            "project.version" to project.version,
            "paper-api.version" to project.property("paperApiVersion"),
            "project.authors" to project.property("authors"),
            "project.group" to project.group,
            "project.type" to project.name,
            "project.name" to "Template"
        )
    }
}

