package com.example.healthcareregistry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// We add scanBasePackages to make sure it finds your 'patient' folder
@SpringBootApplication(scanBasePackages = "com.example")
public class HealthcareRegistryApplication {

    public static void main(String[] args) {
        SpringApplication.run(HealthcareRegistryApplication.class, args);
    }
}