package com.ibmorgan.exerciseclinic.repository;

import com.ibmorgan.exerciseclinic.model.Exercise;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.UUID;

public interface ExerciseRepository extends PagingAndSortingRepository<Exercise, UUID> {

}
