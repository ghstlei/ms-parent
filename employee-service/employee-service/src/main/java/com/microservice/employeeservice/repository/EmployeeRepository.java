package com.microservice.employeeservice.repository;

import com.microservice.employeeservice.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

  public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
    Employee getByName(String name);

    Employee findByName(String name);

  }


