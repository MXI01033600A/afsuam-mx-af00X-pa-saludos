package com.mx.sura_afore.af00X.microservicio.infrastructure.output.client;

import lombok.Data;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "helloWorldClient", url = "http://localhost:8080")
public interface HelloWorldClient {
    @GetMapping("/api/v1/hello-world")
    HelloWorldResponse getHelloWorld();

    @Data
    class HelloWorldResponse {
        private DataObject data;

        @Data
        public static class DataObject {
            private String message;
            private String status;
        }
    }
}
