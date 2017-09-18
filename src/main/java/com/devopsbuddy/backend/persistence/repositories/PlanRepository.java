package com.devopsbuddy.backend.persistence.repositories;

import com.devopsbuddy.backend.persistence.domain.backend.Plan;
import org.springframework.data.repository.CrudRepository;

public interface PlanRepository extends CrudRepository<Plan, Integer> {
}
