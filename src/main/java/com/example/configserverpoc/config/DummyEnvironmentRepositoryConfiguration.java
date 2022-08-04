package com.example.configserverpoc.config;

import com.example.configserverpoc.environment.DummyEnvironmentRepository;
import org.springframework.cloud.config.server.environment.EnvironmentRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DummyEnvironmentRepositoryConfiguration {

    @Bean
    public EnvironmentRepository environmentRepository() {
        return new DummyEnvironmentRepository();
    }
}
