package com.ibmorgan.exerciseclinic.controller;

import com.ibmorgan.exerciseclinic.model.Patient;
import com.ibmorgan.exerciseclinic.repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/patients")
@RestController
public class PatientController {

    @Autowired
    private PatientRepository repository;

    @GetMapping
    public ResponseEntity<List<Patient>> findAllPatients() {
        return ResponseEntity.ok((List<Patient>) repository.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Patient> findPatientById(@PathVariable long id) {
        if (repository.findById(id).isPresent()) {
            return ResponseEntity.ok(repository.findById(id).get());
        }
        return ResponseEntity.notFound().build();
    }

    @PostMapping
    public ResponseEntity<Patient> createPatient(@RequestBody Patient patient) {
        return ResponseEntity.ok(repository.save(patient));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Patient> updatePatient(@PathVariable long id, @RequestBody Patient patient) {
        if (repository.findById(id).isPresent()) {
            return ResponseEntity.ok(repository.save(patient));
        }
        return ResponseEntity.notFound().build();
    }

}
