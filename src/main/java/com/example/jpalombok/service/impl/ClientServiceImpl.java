package com.example.jpalombok.service.impl;
import com.example.jpalombok.domain.Client;
import com.example.jpalombok.repository.ClientRepository;
import com.example.jpalombok.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

@Service("clientService")
public class ClientServiceImpl implements ClientService {

    @Autowired
    private ClientRepository clientRepository;

    @Override
    public Client createAndPersistNewClient(Client client) {
      return clientRepository.save(client);
    }

    @Override
    public Client findById(Long id) {
        return  clientRepository.findById(id).get();
    }
}
