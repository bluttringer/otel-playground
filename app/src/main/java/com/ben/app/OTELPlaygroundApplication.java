package com.ben.app;

import io.opentelemetry.exporter.otlp.http.trace.OtlpHttpSpanExporter;
import io.opentelemetry.exporter.otlp.http.trace.OtlpHttpSpanExporterBuilder;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.actuate.autoconfigure.tracing.otlp.OtlpProperties;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Map;

@SpringBootApplication
public class OTELPlaygroundApplication {

	public static void main(String[] args) {
		SpringApplication.run(OTELPlaygroundApplication.class, args);
	}

//	@Bean
//	OtlpHttpSpanExporter otlpHttpSpanExporter(OtlpProperties properties) {
//		OtlpHttpSpanExporterBuilder builder = OtlpHttpSpanExporter.builder()
//				.setEndpoint(properties.getEndpoint())
//				.setTimeout(properties.getTimeout());
//
//		for (Map.Entry<String, String> header : properties.getHeaders().entrySet()) {
//			builder.addHeader(header.getKey(), header.getValue());
//		}
//
//		return builder.build();
//
//	}
}
