package com.example.consumer.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "producer-service",url = "http://localhost:8081")
public interface ProducerFeignClient {
    @GetMapping("/instance-info")
    String getInstanceInfo();
}
