package com.example.consumer.resttemplate;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
@RequiredArgsConstructor
public class RestTemplateClient {
    private final RestTemplate restTemplate;
    
    @Value("${producer.service.url}")
    private String producerServiceUrl;

    public String getInstanceOf(){
        return restTemplate.getForObject(producerServiceUrl+"/instance-info",String.class);
    }
}
