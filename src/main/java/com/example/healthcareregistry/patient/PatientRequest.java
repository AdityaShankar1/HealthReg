package com.example.healthcareregistry.patient;

/**
 * A Java Record - perfectly immutable DTO for modern APIs.
 */
public record PatientRequest(
        String fullName,
        String contactNumber,
        String bloodGroup,
        String diagnosis
) {}