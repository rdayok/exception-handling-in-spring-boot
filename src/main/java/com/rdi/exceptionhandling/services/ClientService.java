package com.rdi.exceptionhandling.services;

import com.rdi.exceptionhandling.dtos.CreateClientRequest;
import com.rdi.exceptionhandling.dtos.CreateClientResponse;

import java.util.List;

public interface ClientService {
    public CreateClientResponse saveClient(CreateClientRequest saveClientRequest);

    public List<CreateClientResponse> findAllClients();
}
