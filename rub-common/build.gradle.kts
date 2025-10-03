dependencies {
    implementation(project(":api"))
}

tasks.register<Copy>("exportResources") {
    from("src/main/resources")
    into("${buildDir}/exportedResources")
}
