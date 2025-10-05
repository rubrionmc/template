dependencies {
    implementation(project(":common"))

    compileOnly(libs.velocity)
    annotationProcessor(libs.velocity)

    compileOnly(libs.jetanno)
}

tasks.processResources {
    from(project(":common").file("src/main/resources"))
    filteringCharset = "UTF-8"

    filesMatching("**/*.yml") {
        expand(
            "project" to project,
            "project-version" to project.version,
            "paper-api-version" to rootProject.property("paperApiVersion"),
            "project-authors" to rootProject.property("authors"),
            "project-group" to project.group,
            "project-type" to project.name,
            "project-name" to rootProject.property("displayName")
        )
    }
}

