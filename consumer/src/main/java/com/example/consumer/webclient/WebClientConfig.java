package com.example.consumer.webclient;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.client.WebClient;

@Configuration
public class WebClientConfig {
    
    @Value("${producer.service.url}")
    private String producerServiceUrl;
    
    @Bean("producerWebClient")
    public WebClient producerWebClient() {
        return WebClient.builder()
                .baseUrl(producerServiceUrl)
                .build();
    }
}

