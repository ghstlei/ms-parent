package com.microservice.clientservice.repository;

import com.microservice.clientservice.model.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Integer> {
  Client getByName(String name);

  Client findByName(String name);

}
