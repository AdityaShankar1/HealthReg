package com.example.healthcareregistry.patient;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.time.LocalDate;
import java.util.List;

@Service
@RequiredArgsConstructor
public class PatientService {
    private final PatientRepository repository;

    @Transactional
    public Patient registerPatient(PatientRequest request) {
        // Business Rule: Validate basic info before saving to Oracle
        if (request.fullName() == null || request.fullName().isBlank()) {
            throw new IllegalArgumentException("Patient name is required.");
        }

        Patient patient = new Patient();
        patient.setFullName(request.fullName());
        patient.setContactNumber(request.contactNumber());
        patient.setBloodGroup(request.bloodGroup());
        patient.setDiagnosisSummary(request.diagnosis());
        patient.setLastCheckup(LocalDate.now());

        return repository.save(patient);
    }

    public List<Patient> getAllPatients() {
        return repository.findAll();
    }
}