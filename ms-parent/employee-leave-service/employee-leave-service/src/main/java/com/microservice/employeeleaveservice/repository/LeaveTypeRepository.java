package com.microservice.employeeleaveservice.repository;

import com.microservice.employeeleaveservice.model.LeaveType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LeaveTypeRepository extends JpaRepository<LeaveType, Integer> {}
