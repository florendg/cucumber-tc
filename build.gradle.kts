plugins {
    id("java")
    id("com.patdouble.cucumber-jvm").version("0.19")
}

cucumber {
    suite("cucumberTest")
    maxParallelForks = 3
}

repositories {
    mavenCentral()
}

dependencies {
    add("cucumberTestImplementation","io.cucumber:cucumber-java:6.9.0")
    add("cucumberTestImplementation","org.junit.jupiter:junit-jupiter:5.7.0")
    add("cucumberTestImplementation","org.testcontainers:junit-jupiter:1.15.0")
    add("cucumberTestImplementation","org.testcontainers:selenium:1.15.0")
    add("cucumberTestImplementation","org.seleniumhq.selenium:selenium-java:3.141.59")
    testImplementation("org.junit.jupiter:junit-jupiter:5.7.0")
}


tasks {
    test {
        useJUnitPlatform()
    }
}
