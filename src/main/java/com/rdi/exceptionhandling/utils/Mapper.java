package com.rdi.exceptionhandling.utils;

import com.rdi.exceptionhandling.data.models.Client;
import com.rdi.exceptionhandling.dtos.CreateClientRequest;
import com.rdi.exceptionhandling.dtos.CreateClientResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Mapper {

    public static Client map(CreateClientRequest saveClientRequest) {
        return Client.build( 0L, saveClientRequest.getName(),
                saveClientRequest.getEmail(), saveClientRequest.getPhoneNumber(),
                saveClientRequest.getAge(), saveClientRequest.getNationality());
    }

    public static CreateClientResponse map(Client savedClient) {
        return CreateClientResponse.build(savedClient.getId(),
                savedClient.getName(), savedClient.getEmail(),
                savedClient.getPhoneNumber(), savedClient.getAge(),
                savedClient.getNationality());
    }

    public static List<CreateClientResponse> map(List<Client> all) {
        List<CreateClientResponse> allClientResponses = new ArrayList<>();
        for (Client client: all) {
            CreateClientResponse mappedClientResponse = CreateClientResponse.build(client.getId(),
                    client.getName(), client.getEmail(), client.getPhoneNumber(),
                    client.getAge(), client.getNationality());
            allClientResponses.add(mappedClientResponse);
        }
        return allClientResponses;
    }

}
