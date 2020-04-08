package com.ibmorgan.exerciseclinic.controller;

import com.ibmorgan.exerciseclinic.model.Exercise;
import com.ibmorgan.exerciseclinic.repository.ExerciseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ExerciseController {

    @Autowired
    private ExerciseRepository repository;

    public List<Exercise> findAllExercises() {
        return (List<Exercise>) repository.findAll();
    }
}
