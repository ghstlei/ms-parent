package com.microservice.employeeservice.controller;

import com.microservice.employeeservice.model.Employee;
import com.microservice.employeeservice.services.EmployeeService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/emp")
public class EmployeeController {

  @Autowired
  private EmployeeService employeeService;

  // add new employee
  @PostMapping("/addEmployee")
  public Employee addEmployee(@RequestBody Employee employee) {
    return employeeService.addEmployee(employee);
  }

  // more than 1 employee
  @PostMapping("/addEmployees")
  public List<Employee> addAllEmployees(@RequestBody List<Employee> employees){
    return employeeService.addAllEmployees(employees);
  }

  // get employee by id
  @GetMapping("/getEmployeeByID/{id}")
  public Employee getEmployeeById(@PathVariable int id){
    return employeeService.getEmployeeByID(id);
  }

  // get employee by name
  @GetMapping("getEmployeeByName/{name}")
  public Employee getEmployeeByName(@PathVariable String name){
    return employeeService.getEmployeeByName(name);
  }

  // update employee
  @PutMapping("/updateEmployee")
  public Employee updateEmployee(@RequestBody Employee employee){
    return employeeService.updateEmployee(employee);
  }

  // delete employee
  @DeleteMapping("/deleteEmployeeById/{id}")
  public boolean deleteEmployeeByID(@PathVariable int id){
    return employeeService.deleteEmployeeByID(id);
  }


}
