dependencies {
  compileOnly(project(":api"))
  compileOnly(rootProject.libs.imagefilters)

  testImplementation(project(":api"))
  testImplementation(rootProject.libs.imagefilters)
}

tasks.test {
  // The test sources contain a manual image generator, not automated tests.
  failOnNoDiscoveredTests.set(false)
}
