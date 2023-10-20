package com.microservice.employeeleaveservice.controller;

import com.microservice.employeeleaveservice.model.LeaveType;
import com.microservice.employeeleaveservice.services.LeaveTypeService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "http://localhost:4200/")
@RestController
@RequestMapping("/leave")
public class LeaveTypeController {
  @Autowired private LeaveTypeService leaveTypeService;
  @GetMapping("/getAllLeaveType")
  public List<LeaveType> getAllLeaveType() {
    return leaveTypeService.findAll();
  }

}
