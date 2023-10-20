package com.microservice.employeeleaveservice.repository;

import com.microservice.employeeleaveservice.model.Type;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TypeRepository extends JpaRepository<Type, Integer> {}
