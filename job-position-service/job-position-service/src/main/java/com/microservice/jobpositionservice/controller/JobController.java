package com.microservice.jobpositionservice.controller;

import com.microservice.jobpositionservice.model.JobPosition;
import com.microservice.jobpositionservice.services.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/job")
public class JobController {

  @Autowired
  private JobService jobService;

  // add new job
  @PostMapping("/addJobPosition")
  public JobPosition addClient(@RequestBody JobPosition jobPosition) {
    return jobService.addJob(jobPosition);
  }

  // get job by id
  @GetMapping("/getJobByID/{id}")
  public JobPosition getJobById(@PathVariable int id){
    return jobService.getJobByID(id);
  }

  // get job by name
  @GetMapping("getJobByName/{name}")
  public JobPosition getJobByName(@PathVariable String name){
    return jobService.getJobByName(name);
  }

  // update job
  @PutMapping("/updateJob")
  public JobPosition updateJob(@RequestBody JobPosition jobPosition){
    return jobService.updateJob(jobPosition);
  }

  // delete client
  @DeleteMapping("/deleteJobById/{id}")
  public boolean deleteJobByID(@PathVariable int id){
    return jobService.deleteJobByID(id);
  }


}
