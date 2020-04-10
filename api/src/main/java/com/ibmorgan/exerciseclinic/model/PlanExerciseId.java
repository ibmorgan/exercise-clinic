package com.ibmorgan.exerciseclinic.model;

import java.io.Serializable;
import java.util.Objects;

public class PlanExerciseId implements Serializable {

    private long plan;
    private long exercise;

    public long getPlan() {
        return plan;
    }

    public void setPlan(long plan) {
        this.plan = plan;
    }

    public long getExercise() {
        return exercise;
    }

    public void setExercise(long exercise) {
        this.exercise = exercise;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PlanExerciseId)) return false;
        PlanExerciseId that = (PlanExerciseId) o;
        return getPlan() == that.getPlan() &&
                getExercise() == that.getExercise();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getPlan(), getExercise());
    }
}
