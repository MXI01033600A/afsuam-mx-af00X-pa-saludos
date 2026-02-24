package com.mx.sura_afore.af00X;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = { "com.mx.sura_afore" })
@EnableFeignClients
public class PapiImplApp {
    public static void main(String[] args) {
        SpringApplication.run(PapiImplApp.class, args);
    }
}
