package com.microservice.clientservice.services;

import com.microservice.clientservice.model.Client;
import com.microservice.clientservice.repository.ClientRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClientService {

  @Autowired private ClientRepository clientRepository;

  public Client addClient(Client client) {
    return clientRepository.save(client);
  }

  public Client getClientByID(int id) {
    return clientRepository.findById(id).orElse(null);

  }

  public Client getClientByName(String name) {
    return clientRepository.findByName(name);
  }

  // get all clients
  public List<Client> findAll() {
    return clientRepository.findAll();
  }

  public Client updateClient(Client client) {
    Client existingCLT = clientRepository.findById(client.getId()).orElse(null);

    if (existingCLT == null) {
      return clientRepository.save(client);
    } else {
      clientRepository.deleteById(existingCLT.getId());
      clientRepository.save(client);
    }
    return client;
  }

  public boolean deleteClientByID(int id) {
    Client existingCLT = clientRepository.getById(id);
    if (existingCLT != null) {
      clientRepository.deleteById(id);
      return true;
    }
    return false;
  }
}
