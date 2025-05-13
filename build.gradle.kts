allprojects {
    repositories {
        mavenCentral()
    }
}

subprojects {
    group = "com.example"
    version = "1.0.0"

    plugins.withType<JavaPlugin> {
        extensions.configure<JavaPluginExtension> {
            sourceCompatibility = JavaVersion.VERSION_17
            targetCompatibility = JavaVersion.VERSION_17
        }
    }


}
