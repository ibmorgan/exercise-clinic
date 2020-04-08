package com.ibmorgan.exerciseclinic.repository;

import com.ibmorgan.exerciseclinic.model.Exercise;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "exercises", path = "exercises")
public interface ExerciseRepository extends CrudRepository<Exercise, Long> {
}
