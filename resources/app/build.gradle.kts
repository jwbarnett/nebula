plugins {
    id("io.micronaut.application") version "3.6.2"
}

micronaut {
    version.set("3.6.2")
}

application {
    mainClass.set("org.example.resources.http.ResourcesApp")
}

dependencies {
    annotationProcessor("org.mapstruct:mapstruct-processor:1.5.2.Final")

    implementation(project(":domain"))
    implementation(project(":infrastructure"))
    implementation("io.micronaut:micronaut-runtime")
    implementation("io.micronaut:micronaut-inject")
    implementation("io.micronaut:micronaut-http-client")
    implementation("io.micronaut:micronaut-http-server-netty")
    implementation("io.micronaut.flyway:micronaut-flyway")
    implementation("org.mapstruct:mapstruct:1.5.2.Final")

    runtimeOnly("ch.qos.logback:logback-classic")

    testAnnotationProcessor("io.micronaut:micronaut-inject-java")

    testImplementation("io.micronaut.test:micronaut-test-junit5")
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.8.1")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:5.8.1")
}

sourceSets {
    main {
        java.srcDir("src/main/java")
    }
}
