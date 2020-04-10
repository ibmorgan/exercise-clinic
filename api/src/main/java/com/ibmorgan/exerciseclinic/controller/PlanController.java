package com.ibmorgan.exerciseclinic.controller;

import com.ibmorgan.exerciseclinic.model.Plan;
import com.ibmorgan.exerciseclinic.repository.PlanRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PlanController {

    @Autowired
    private PlanRepository repository;

    @GetMapping("/plans")
    public ResponseEntity<List<Plan>> findAllPlans() {
        return ResponseEntity.ok((List<Plan>) repository.findAll());
    }

    @GetMapping("/plans/{id}")
    public ResponseEntity<Plan> findPlanById(@PathVariable long id) {
        if (repository.findById(id).isPresent()) {
            return ResponseEntity.ok(repository.findById(id).get());
        }
        return ResponseEntity.notFound().build();
    }

    @PostMapping("/plans")
    public ResponseEntity<Plan> createPlan(@RequestBody Plan plan) {
        return ResponseEntity.ok(repository.save(plan));
    }

    @PutMapping("/plans/{id}")
    public ResponseEntity<Plan> updatePlan(@PathVariable long id, @RequestBody Plan plan) {
        if (repository.findById(id).isPresent()) {
            return ResponseEntity.ok(repository.save(plan));
        }
        return ResponseEntity.notFound().build();
    }

    @DeleteMapping("/plans")
    public ResponseEntity deletePlan(@PathVariable long id) {
        if (repository.findById(id).isPresent()) {
            repository.deleteById(id);
            return ResponseEntity.ok().build();
        }
        return ResponseEntity.notFound().build();
    }
}