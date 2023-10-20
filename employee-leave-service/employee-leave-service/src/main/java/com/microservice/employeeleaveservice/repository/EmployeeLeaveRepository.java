package com.microservice.employeeleaveservice.repository;

import com.microservice.employeeleaveservice.model.EmployeeLeave;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeLeaveRepository extends JpaRepository<EmployeeLeave, Integer> {}
