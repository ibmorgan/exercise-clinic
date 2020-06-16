package com.ibmorgan.exerciseclinic.repository;

import com.ibmorgan.exerciseclinic.model.Plan;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlanRepository extends CrudRepository<Plan, Long> {
}
