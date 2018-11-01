package com.example.jpalombok.resource;

import com.example.jpalombok.domain.Client;
import com.example.jpalombok.service.impl.ClientServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClientResource {

    @Autowired
    private ClientServiceImpl clientServiceImpl;

    @GetMapping("{id}")
    public Client findById(@PathVariable Long id){
        return clientServiceImpl.findById(id);
    }

}
