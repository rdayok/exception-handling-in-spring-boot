package com.rdi.exceptionhandling.services;

import com.rdi.exceptionhandling.data.models.Client;
import com.rdi.exceptionhandling.data.repositories.ClientRepository;
import com.rdi.exceptionhandling.dtos.CreateClientRequest;
import com.rdi.exceptionhandling.dtos.CreateClientResponse;
import com.rdi.exceptionhandling.utils.Mapper;
import org.springframework.stereotype.Service;

import java.util.List;

import static com.rdi.exceptionhandling.utils.Mapper.map;

@Service
public class ClientServiceImpl implements ClientService {
    private final ClientRepository clientRepository;

    public ClientServiceImpl(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }

    @Override
    public CreateClientResponse saveClient(CreateClientRequest saveClientRequest) {
        Client client = map(saveClientRequest);
        Client savedClient = clientRepository.save(client);
        return map(savedClient);
    }

    @Override
    public List<CreateClientResponse> findAllClients() {
        return Mapper.map(clientRepository.findAll());
    }

    public CreateClientResponse findUser(Long id) {
        return Mapper.map(clientRepository.findByIdUserId(id));
    }
}
