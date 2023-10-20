package com.microservice.employeeservice.repository;

import com.microservice.employeeservice.model.Type;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TypeRepository extends JpaRepository<Type, Integer> {
  Type getByName(String name);

  Type findByName(String name);
}
