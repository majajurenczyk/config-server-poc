package com.example.configserverpoc.environment;

import org.springframework.cloud.config.environment.Environment;
import org.springframework.cloud.config.environment.PropertySource;
import org.springframework.cloud.config.server.environment.EnvironmentRepository;
import org.springframework.util.StringUtils;

import java.util.HashMap;

public class DummyEnvironmentRepository implements EnvironmentRepository {

    @Override
    public Environment findOne(String application, String profile, String label) {
        Environment environment;
        String[] profilesArr = StringUtils.commaDelimitedListToStringArray(profile);
        if (application.equals("pickup-order-service") && profile.equals("local")) {
            environment = new Environment(application, profilesArr, label, null, null);
            PropertySource propertySource = new PropertySource("dummy-properties-source", createDummyProperties());
            environment.add(propertySource);
            return environment;
        }
        throw new IllegalStateException("Cannot load environment");
    }

    private HashMap<String, String> createDummyProperties() {
        HashMap<String, String> properties = new HashMap<>();
        properties.put("prop1", "prop1_value_new_new");
        properties.put("prop2", "prop2_value_new");
        return properties;
    }
}
