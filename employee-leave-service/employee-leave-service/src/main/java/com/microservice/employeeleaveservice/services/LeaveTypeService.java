package com.microservice.employeeleaveservice.services;

import com.microservice.employeeleaveservice.model.LeaveType;
import com.microservice.employeeleaveservice.repository.LeaveTypeRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LeaveTypeService {
  @Autowired private LeaveTypeRepository leaveTypeRepository;
  
  public List<LeaveType> findAll() {
    return leaveTypeRepository.findAll();
  }


}
