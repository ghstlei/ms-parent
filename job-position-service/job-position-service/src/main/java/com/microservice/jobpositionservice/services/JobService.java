package com.microservice.jobpositionservice.services;

import com.microservice.jobpositionservice.model.JobPosition;
import com.microservice.jobpositionservice.repository.JobRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class JobService {

  @Autowired
  private JobRepository jobRepository;

  public JobPosition addJob(JobPosition jobPosition){
    return jobRepository.save(jobPosition);
  }

  public JobPosition getJobByID(int id){
    return jobRepository.findById(id).orElse(null);
  }

  public JobPosition getJobByName(String name){
    return jobRepository.findByName(name);
  }

  public JobPosition updateJob(JobPosition jobPosition){
    JobPosition existingJOB = jobRepository.findById(jobPosition.getId()).orElse(null);

    if(existingJOB == null){
      return jobRepository.save(jobPosition);
    }
    else{
      jobRepository.deleteById(existingJOB.getId());
      jobRepository.save(jobPosition);
    }
    return jobPosition;
  }
  public boolean deleteJobByID(int id){
    JobPosition existingJOB = jobRepository.getById(id);
    if(existingJOB != null){
      jobRepository.deleteById(id);
      return true;
    }
    return false;
  }

}
