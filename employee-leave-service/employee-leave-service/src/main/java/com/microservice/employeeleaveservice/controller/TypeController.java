package com.microservice.employeeleaveservice.controller;

import com.microservice.employeeleaveservice.model.Type;
import com.microservice.employeeleaveservice.services.TypeService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "http://localhost:4200/")
@RestController
@RequestMapping("/leave")
public class TypeController {
  @Autowired private TypeService typeService;

  @GetMapping("/getAllType")
  public List<Type> getAllType() {
    return typeService.findAll();
  }
}
