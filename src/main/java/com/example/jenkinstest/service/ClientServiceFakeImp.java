package com.example.jenkinstest.service;

import com.example.jenkinstest.model.Client;
import org.springframework.stereotype.Service;

@Service
public class ClientServiceFakeImp implements ClientService{

  @Override
  public Client getNewClient() {
    return Client.createClient();
  }
}
