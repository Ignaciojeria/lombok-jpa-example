package com.example.jpalombok.domain;


import com.example.jpalombok.domain.Client;
import org.junit.Test;

public class ClientTest {

    @Test
    public void builderTest() {
        Client client=Client.builder().id(1L).firstName("Ignacio").surName("Jeria").build();
    }
}
