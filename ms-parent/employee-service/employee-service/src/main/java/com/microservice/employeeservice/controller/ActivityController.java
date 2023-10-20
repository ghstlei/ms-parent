package com.microservice.employeeservice.controller;

import com.microservice.employeeservice.model.Activity;
import com.microservice.employeeservice.services.ActivityService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "http://localhost:4200/")
@RestController
@RequestMapping("/emp")
public class ActivityController {

  @Autowired private ActivityService activityService;

  // get employee by id
  @GetMapping("/getActivityByID/{id}")
  public Activity getActivityById(@PathVariable int id) {
    return activityService.getActivityByID(id);
  }

  // get employee by name
  @GetMapping("getActivityByName/{name}")
  public Activity getActivityByName(@PathVariable String name) {
    return activityService.getActivityByName(name);
  }

  // get all clients
  @GetMapping("/getAllActivity")
  public List<Activity> getAllActivity() {
    return activityService.findAll();
  }
}
