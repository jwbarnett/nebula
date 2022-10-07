plugins {
    `java-library`
}

dependencies {
    annotationProcessor("org.mapstruct:mapstruct-processor:1.5.2.Final")

    implementation(project(":domain"))
    implementation("org.mapstruct:mapstruct:1.5.2.Final")

    testImplementation("org.junit.jupiter:junit-jupiter-api:5.8.1")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:5.8.1")
}

sourceSets {
    main {
        java.srcDir("src/main/java")
    }
}
