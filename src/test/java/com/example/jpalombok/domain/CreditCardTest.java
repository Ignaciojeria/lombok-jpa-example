package com.example.jpalombok.domain;

import org.junit.Test;

public class CreditCardTest {

    @Test
    private void builderTest(){
        Client client= Client.builder().id(1L).firstName("Ignacio").surName("Jeria").build();
        CreditCard creditCard=CreditCard.builder().client(client).id(1L).code("A0F000000").build();
    }
}
