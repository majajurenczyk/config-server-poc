package com.example.configserverpoc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableDummyConfigServer
public class ConfigServerPocApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConfigServerPocApplication.class, args);
    }
}
