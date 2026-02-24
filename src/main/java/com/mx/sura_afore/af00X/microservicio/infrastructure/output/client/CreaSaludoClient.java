package com.mx.sura_afore.af00X.microservicio.infrastructure.output.client;

import lombok.Data;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "creaSaludoClient", url = "http://localhost:8081")
public interface CreaSaludoClient {
    @GetMapping("/api/v1/saludo/{name}")
    SaludoResponse getSaludo(@PathVariable("name") String name);

    @Data
    class SaludoResponse {
        private String saludo;
    }
}
