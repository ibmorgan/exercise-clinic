package com.ibmorgan.exerciseclinic.controller;

import com.ibmorgan.exerciseclinic.model.Exercise;
import com.ibmorgan.exerciseclinic.repository.ExerciseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/exercises")
public class ExerciseController {

    @Autowired
    private ExerciseRepository repository;

    @GetMapping
    public ResponseEntity<List<Exercise>> findAllExercises() {
        return ResponseEntity.ok((List<Exercise>) repository.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Exercise> findExerciseById(@PathVariable long id) {
        if (repository.findById(id).isPresent()) {
            return ResponseEntity.ok(repository.findById(id).get());
        }
        return ResponseEntity.notFound().build();
    }

    @PostMapping
    public ResponseEntity<Exercise> createExercise(@RequestBody Exercise exercise) {
        return ResponseEntity.ok(repository.save(exercise));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Exercise> updateExercise(@PathVariable long id, @RequestBody Exercise exercise) {
        if (repository.findById(id).isPresent()) {
            return ResponseEntity.ok(repository.save(exercise));
        }
        return ResponseEntity.notFound().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity deleteExercise(@PathVariable long id) {
        if (repository.findById(id).isPresent()) {
            return ResponseEntity.badRequest().build();
        }
        repository.deleteById(id);
        return ResponseEntity.ok().build();
    }
}
