package com.microservice.employeeleaveservice.services;

import com.microservice.employeeleaveservice.model.Type;
import com.microservice.employeeleaveservice.repository.TypeRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TypeService {
  @Autowired private TypeRepository typeRepository;

  public List<Type> findAll() {
    return typeRepository.findAll();
  }
}
