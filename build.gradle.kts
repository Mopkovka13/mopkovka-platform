subprojects {
    plugins.withId("java") {
        extensions.configure<JavaPluginExtension> {
            toolchain {
                languageVersion = JavaLanguageVersion.of(21)
            }
        }
        tasks.withType<Test> {
            useJUnitPlatform()
        }
    }
}
