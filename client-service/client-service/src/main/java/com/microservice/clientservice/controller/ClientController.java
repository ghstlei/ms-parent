package com.microservice.clientservice.controller;


import com.microservice.clientservice.model.Client;
import com.microservice.clientservice.services.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/clt")
public class ClientController {

  @Autowired
  private ClientService clientService;

  // add new client
  @PostMapping("/addClient")
  public Client addClient(@RequestBody Client client) {
    return clientService.addClient(client);
  }

  // get client by id
  @GetMapping("/getClientByID/{id}")
  public Client getClientById(@PathVariable int id){
    return clientService.getClientByID(id);
  }

  // get client by name
  @GetMapping("getClientByName/{name}")
  public Client getClientByName(@PathVariable String name){
    return clientService.getClientByName(name);
  }

  // update client
  @PutMapping("/updateClient")
  public Client updateClient(@RequestBody Client client){
    return clientService.updateClient(client);
  }

  // delete client
  @DeleteMapping("/deleteClientById/{id}")
  public boolean deleteClientByID(@PathVariable int id){
    return clientService.deleteClientByID(id);
  }


}
