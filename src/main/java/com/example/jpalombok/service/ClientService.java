package com.example.jpalombok.service;
import com.example.jpalombok.domain.Client;

public interface ClientService {

    Client createAndPersistNewClient(Client client);

    Client findById(Long id);
}
