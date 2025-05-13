plugins {
    application
    java
}

application {
    mainClass.set("com.example.service1.Main")
}

dependencies {
    implementation(project(":libraries:lib1"))
    implementation(project(":libraries:lib2"))
    implementation(project(":libraries:lib3"))
}
