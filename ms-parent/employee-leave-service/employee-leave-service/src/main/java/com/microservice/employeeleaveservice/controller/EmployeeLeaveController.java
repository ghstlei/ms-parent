package com.microservice.employeeleaveservice.controller;

import com.microservice.employeeleaveservice.model.EmployeeLeave;
import com.microservice.employeeleaveservice.services.EmployeeLeaveService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "http://localhost:4200/")
@RestController
@RequestMapping("/leave")
public class EmployeeLeaveController {

  @Autowired private EmployeeLeaveService employeeLeaveService;

  // add new client
  @PostMapping("/addLeave")
  public EmployeeLeave addLeave(@RequestBody EmployeeLeave employeeLeave) {
    return employeeLeaveService.addLeave(employeeLeave);
  }

  // get client by id
  @GetMapping("/getLeaveByID/{id}")
  public EmployeeLeave getLeaveById(@PathVariable int id) {
    return employeeLeaveService.getLeaveByID(id);
  }

  // get all leave
  @GetMapping("/getAllLeave")
  public List<EmployeeLeave> getAllLeave() {
    return employeeLeaveService.findAll();
  }

  // update client
  @PutMapping("/updateLeave")
  public EmployeeLeave updateLeave(@RequestBody EmployeeLeave employeeLeave) {
    return employeeLeaveService.updateLeave(employeeLeave);
  }

  // delete client
  @DeleteMapping("/deleteLeaveById/{id}")
  public boolean deleteLeaveByID(@PathVariable int id) {
    return employeeLeaveService.deleteLeaveByID(id);
  }
}
