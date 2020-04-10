package com.ibmorgan.exerciseclinic.exception;

public class PlanNotFoundException extends RuntimeException {
    public PlanNotFoundException(long id) {
        super(String.format("Plan with the ID: %o, not found", id));
    }
}
