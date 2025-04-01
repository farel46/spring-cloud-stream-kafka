package com.example.cloud_stream.function;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.util.function.Consumer;

@Component
public class EventProcessing {

    @Bean
    public Consumer<String> orderCreated() {
        return value -> System.out.println("[created] " + value);
    }

    @Bean
    public Consumer<String> orderProcessed() {
        return value -> System.out.println("[processed] " + value);
    }
}
