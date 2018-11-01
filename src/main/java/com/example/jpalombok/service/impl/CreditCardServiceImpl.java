package com.example.jpalombok.service.impl;

import com.example.jpalombok.domain.Client;
import com.example.jpalombok.domain.CreditCard;
import com.example.jpalombok.repository.CreditCardRepository;
import com.example.jpalombok.service.CreditCardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service("creditCardService")
public class CreditCardServiceImpl implements CreditCardService {

    @Autowired
    private CreditCardRepository creditCardRepository;

    @Override
    public CreditCard createDisabledNewCreditCard() {
        return creditCardRepository.save(
                CreditCard
                        .builder()
                        .code(UUID.randomUUID().toString())
                        .enabled(false)
                        .build());
    }

    @Override
    public CreditCard associateCreditCardWithAClient(Client client, CreditCard creditCard) {
        creditCard.setClient(client);
        return creditCardRepository.save(creditCard);
    }
}
