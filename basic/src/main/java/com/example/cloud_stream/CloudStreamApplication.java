package com.example.cloud_stream;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.messaging.Message;

import java.util.function.Consumer;

@Slf4j
@SpringBootApplication
public class CloudStreamApplication {

	public static void main(String[] args) {
		SpringApplication.run(CloudStreamApplication.class, args);
	}

	@Bean
	public Consumer<Message<String>> ingest() {
		return value -> log.info(value.getHeaders().toString() + " " + value.getPayload());
	}
}
