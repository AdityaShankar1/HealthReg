package com.example.healthcareregistry.patient;

import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDate;

@Entity
@Table(name = "PATIENTS")
@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
public class Patient {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String fullName;

    private String contactNumber;
    private String bloodGroup;
    private LocalDate lastCheckup;

    @Column(length = 1000)
    private String diagnosisSummary;
}