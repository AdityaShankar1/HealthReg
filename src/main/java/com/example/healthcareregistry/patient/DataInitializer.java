package com.example.healthcareregistry.patient;

import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import java.time.LocalDate;
import java.util.List;

@Component
@RequiredArgsConstructor
public class DataInitializer implements CommandLineRunner {

    private final PatientRepository repository;

    @Override
    public void run(String... args) {
        if (repository.count() == 0) {
            Patient p1 = new Patient(null, "Aditya Shankar", "9876543210", "O+", LocalDate.now(), "General Checkup");
            Patient p2 = new Patient(null, "John Doe", "1234567890", "A-", LocalDate.now().minusDays(5), "Flu Symptoms");

            repository.saveAll(List.of(p1, p2));
            System.out.println("✅ Oracle DB Seeded with Initial Patient Data!");
        }
    }
}