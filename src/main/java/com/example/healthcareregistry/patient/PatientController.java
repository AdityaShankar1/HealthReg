package com.example.healthcareregistry.patient;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/patients")
@RequiredArgsConstructor
@CrossOrigin(origins = "*") // Allows your frontend to talk to this API
public class PatientController {
    private final PatientService service;

    @PostMapping("/register")
    public ResponseEntity<Patient> register(@RequestBody PatientRequest request) {
        return ResponseEntity.ok(service.registerPatient(request));
    }

    @GetMapping
    public List<Patient> getPatients() {
        return service.getAllPatients();
    }
}