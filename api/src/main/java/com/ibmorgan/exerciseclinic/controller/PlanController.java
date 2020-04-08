package com.ibmorgan.exerciseclinic.controller;

import com.ibmorgan.exerciseclinic.exception.PlanNotFoundException;
import com.ibmorgan.exerciseclinic.model.Plan;
import com.ibmorgan.exerciseclinic.repository.PlanRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PlanController {

    @Autowired
    private PlanRepository repository;

    @GetMapping("/plans")
    public List<Plan> findAllPlans() {
        return (List<Plan>) repository.findAll();
    }

    @GetMapping("/plans/{id}")
    public Plan findPlanById(@PathVariable long id) {
        return repository.findById(id).orElseThrow(() -> new PlanNotFoundException(id));
    }

    @PostMapping("/plans")
    public Plan createPlan(@RequestBody Plan plan) {
        return repository.save(plan);
    }

    @PatchMapping("/plans/{id}")
    public Plan update(@PathVariable long id, @RequestBody Plan plan) {
        if (repository.findById(id).isPresent()) {
            var existingPlan = repository.findById(id).get();
            existingPlan.setName(plan.getName());
            existingPlan.setDescription(plan.getDescription());

            return repository.save(existingPlan);
        } else {
            throw new PlanNotFoundException(id);
        }
    }

}
