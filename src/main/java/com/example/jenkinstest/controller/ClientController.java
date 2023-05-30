package com.example.jenkinstest.controller;

import com.example.jenkinstest.model.Client;
import com.example.jenkinstest.service.ClientService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/client")
public class ClientController {

  private final ClientService clientService;

  public ClientController(ClientService clientService) {
    this.clientService = clientService;
  }

  @GetMapping
  public Client fetchClient() {

    return clientService.getNewClient();


  }

}
