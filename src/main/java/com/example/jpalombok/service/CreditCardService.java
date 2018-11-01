package com.example.jpalombok.service;

import com.example.jpalombok.domain.Client;
import com.example.jpalombok.domain.CreditCard;

public interface CreditCardService {

    CreditCard createDisabledNewCreditCard();

    CreditCard associateCreditCardWithAClient(Client client, CreditCard creditCard);
}
