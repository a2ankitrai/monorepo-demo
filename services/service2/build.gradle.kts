plugins {
    application
    java
}

application {
    mainClass.set("com.example.service2.Main")
}

dependencies {
    implementation(project(":libraries:lib1"))
    implementation(project(":libraries:lib3"))
}