import org.springframework.boot.gradle.tasks.bundling.BootBuildImage

plugins {
	java
	id("org.springframework.boot") version "3.2.2"
	id("io.spring.dependency-management") version "1.1.4"
	id("com.ryandens.javaagent-application") version "0.4.2"
}

group = "com.ben"
version = "0.0.1-SNAPSHOT"

java {
	sourceCompatibility = JavaVersion.VERSION_21
}

configurations {
	compileOnly {
		extendsFrom(configurations.annotationProcessor.get())
	}
}

application {
	mainClass = "com.ben.app.OTELPlaygroundApplication"
	applicationDefaultJvmArgs = listOf("-Dotel.javaagent.configuration-file=src/main/resources/otel-agent.properties")
}

repositories {
	mavenCentral()
}

dependencies {
	implementation("org.springframework.boot:spring-boot-starter-web")
	implementation("org.springframework.boot:spring-boot-starter-actuator")
	implementation("io.opentelemetry:opentelemetry-exporter-otlp")
	compileOnly("org.projectlombok:lombok")
	developmentOnly("org.springframework.boot:spring-boot-devtools")
	annotationProcessor("org.projectlombok:lombok")
	testImplementation("org.springframework.boot:spring-boot-starter-test")
	javaagent("io.opentelemetry.javaagent:opentelemetry-javaagent:2.2.0")
}

tasks.withType<Test> {
	useJUnitPlatform()
}

tasks.named<BootBuildImage>("bootBuildImage") {
	imageName.set("ben/otel-playground-service")
}
