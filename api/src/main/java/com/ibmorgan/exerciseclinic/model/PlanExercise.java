package com.ibmorgan.exerciseclinic.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;

@Entity
@Table(name = "plan_exercise")
@IdClass(PlanExerciseId.class)
public class PlanExercise {

    @Id
    @ManyToOne
    @JoinColumn(name = "plan_id", referencedColumnName = "id")
    @JsonIgnoreProperties("planExercises")
    private Plan plan;

    @Id
    @ManyToOne
    @JoinColumn(name = "exercise_id", referencedColumnName = "id")
    @JsonIgnoreProperties("planExercises")
    private Exercise exercise;

    private int position;

    public PlanExercise() {
    }

    public Plan getPlan() {
        return plan;
    }

    public void setPlan(Plan plan) {
        this.plan = plan;
    }

    public Exercise getExercise() {
        return exercise;
    }

    public void setExercise(Exercise exercise) {
        this.exercise = exercise;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }
}
