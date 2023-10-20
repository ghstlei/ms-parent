package com.microservice.employeeservice.repository;

import com.microservice.employeeservice.model.Activity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ActivityRepository extends JpaRepository<Activity, Integer> {
  Activity getByName(String name);

  Activity findByName(String name);
}
