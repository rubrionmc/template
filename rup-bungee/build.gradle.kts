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
            "project" to project,
            "projectVersion" to project.version,
            "paperApiVersion" to rootProject.property("paperApiVersion"),
            "projectAuthors" to rootProject.property("authors"),
            "projectGroup" to project.group,
            "projectType" to project.name,
            "projectName" to rootProject.property("displayName"),
            "projectDescription" to rootProject.property("description")
        )
    }
}
