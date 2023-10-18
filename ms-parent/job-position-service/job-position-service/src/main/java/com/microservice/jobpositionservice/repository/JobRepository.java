package com.microservice.jobpositionservice.repository;

import com.microservice.jobpositionservice.model.JobPosition;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JobRepository extends JpaRepository<JobPosition, Integer> {
  JobPosition getByName(String name);

  JobPosition findByName(String name);

}
