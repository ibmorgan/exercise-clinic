package com.ibmorgan.exerciseclinic.model;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "exercises")
public class Exercise {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String name;
    private String description;

    @OneToMany(mappedBy = "exercise")
    @JsonBackReference
    private List<PlanExercise> planExercises = new ArrayList<>();

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<PlanExercise> getPlanExercises() {
        return planExercises;
    }

    public void setPlanExercises(List<PlanExercise> planExercises) {
        this.planExercises = planExercises;
    }
}
