package com.microservice.employeeleaveservice.services;

import com.microservice.employeeleaveservice.model.EmployeeLeave;
import com.microservice.employeeleaveservice.repository.EmployeeLeaveRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeLeaveService {

  @Autowired private EmployeeLeaveRepository leaveRepository;

  public EmployeeLeave addLeave(EmployeeLeave employeeLeave) {
    return leaveRepository.save(employeeLeave);
  }

  public EmployeeLeave getLeaveByID(int id) {
    return leaveRepository.findById(id).orElse(null);
  }

  // get all employees
  public List<EmployeeLeave> findAll() {
    return leaveRepository.findAll();
  }

  public EmployeeLeave updateLeave(EmployeeLeave employeeLeave) {
    EmployeeLeave existingLeave = leaveRepository.findById(employeeLeave.getId()).orElse(null);

    if (existingLeave == null) {
      return leaveRepository.save(employeeLeave);
    } else {
      leaveRepository.deleteById(existingLeave.getId());
      leaveRepository.save(employeeLeave);
    }
    return employeeLeave;
  }

  public boolean deleteLeaveByID(int id) {
    EmployeeLeave existingLeave = leaveRepository.getById(id);
    if (existingLeave != null) {
      leaveRepository.deleteById(id);
      return true;
    }
    return false;
  }
}
