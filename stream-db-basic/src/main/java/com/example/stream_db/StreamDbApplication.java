package com.example.stream_db;

import com.example.stream_db.service.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.messaging.Message;

import java.util.function.Consumer;

@SpringBootApplication
public class StreamDbApplication {
	@Autowired
	private EventService eventService;

	public static void main(String[] args) {
		SpringApplication.run(StreamDbApplication.class, args);
	}

	@Bean
	public Consumer<Message<String>> ingest() {
		return value -> eventService.saveEvent(value.getPayload());
	}
}
