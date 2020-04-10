package com.ibmorgan.exerciseclinic.exception;

public class ExerciseNotFoundException extends RuntimeException {
    public ExerciseNotFoundException(long id) {
        super(String.format("Exercise with the ID: %o, not found", id));
    }
}
