dependencies {
    implementation(project(":api"))
    compileOnly(libs.jetanno)
    compileOnly(libs.common)
    compileOnly(libs.slf4j)
}

tasks.register<Copy>("exportResources") {
    from("src/main/resources")
    into("${buildDir}/exportedResources")
}
