package com.microservice.employeeservice.controller;

import com.microservice.employeeservice.model.Type;
import com.microservice.employeeservice.services.TypeService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "http://localhost:4200/")
@RestController
@RequestMapping("/emp")
public class TypeController {

  @Autowired private TypeService typeService;

  // get type by id
  @GetMapping("/getTypeByID/{id}")
  public Type getTypeById(@PathVariable int id) {
    return typeService.getTypeByID(id);
  }

  // get type by name
  @GetMapping("getTypeByName/{name}")
  public Type getTypeByName(@PathVariable String name) {
    return typeService.getTypeByName(name);
  }

  // get all type
  @GetMapping("/getAllType")
  public List<Type> getAllType() {
    return typeService.findAll();
  }
}
