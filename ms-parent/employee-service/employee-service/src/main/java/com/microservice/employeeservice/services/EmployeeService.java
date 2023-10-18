package com.microservice.employeeservice.services;

import com.microservice.employeeservice.model.Employee;
import com.microservice.employeeservice.repository.EmployeeRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    public Employee addEmployee(Employee employee){
      return employeeRepository.save(employee);
    }

    public List<Employee> addAllEmployees(List<Employee> employees){
      return employeeRepository.saveAll(employees);
    }

  public Employee getEmployeeByID(int id) {
      return employeeRepository.findById(id).orElse(null);
    }

    public Employee getEmployeeByName(String name){
      return employeeRepository.findByName(name);
    }

  // get all employees
  public List<Employee> findAll() {
    return employeeRepository.findAll();
  }

    public Employee updateEmployee(Employee employee){
      Employee existingEMP = employeeRepository.findById(employee.getId()).orElse(null);

      if(existingEMP == null){
        return employeeRepository.save(employee);
      }
      else{
        employeeRepository.deleteById(existingEMP.getId());
        employeeRepository.save(employee);
      }
      return employee;
    }

  public boolean deleteEmployeeByID(int id) {
      Employee existingEMP = employeeRepository.getById(id);
      if(existingEMP != null){
        employeeRepository.deleteById(id);
        return true;
      }
      return false;
    }

  }

