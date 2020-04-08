package com.ibmorgan.exerciseclinic.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;

import javax.persistence.*;

@Entity
@Table(name = "plan_exercise")
public class PlanExercise {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @ManyToOne(targetEntity = Plan.class, cascade = CascadeType.ALL)
    @JoinColumn(name = "plan_id")
    @JsonBackReference
    private Plan plan;

    @ManyToOne(targetEntity = Exercise.class, cascade = CascadeType.ALL)
    @JoinColumn(name = "exercise_id")
    @JsonBackReference
    private Exercise exercise;

    private int position;

    public PlanExercise() {
    }

    public long getId() {
        return id;
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
