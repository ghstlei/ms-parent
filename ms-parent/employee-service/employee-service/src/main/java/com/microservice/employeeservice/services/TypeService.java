package com.microservice.employeeservice.services;

import com.microservice.employeeservice.model.Type;
import com.microservice.employeeservice.repository.TypeRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TypeService {

  @Autowired private TypeRepository typeRepository;

  public Type getTypeByID(int id) {
    return typeRepository.findById(id).orElse(null);
  }

  public Type getTypeByName(String name) {
    return typeRepository.findByName(name);
  }

  // get all types
  public List<Type> findAll() {
    return typeRepository.findAll();
  }
}
