package com.microservice.employeeservice.services;

import com.microservice.employeeservice.model.Activity;
import com.microservice.employeeservice.repository.ActivityRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ActivityService {

  @Autowired private ActivityRepository activityRepository;

  public Activity getActivityByID(int id) {
    return activityRepository.findById(id).orElse(null);
  }

  public Activity getActivityByName(String name) {
    return activityRepository.findByName(name);
  }

  // get all employees
  public List<Activity> findAll() {
    return activityRepository.findAll();
  }
}
