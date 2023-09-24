package com.rdi.exceptionhandling.services;

import com.rdi.exceptionhandling.data.models.Client;
import com.rdi.exceptionhandling.data.repositories.ClientRepository;
import com.rdi.exceptionhandling.dtos.CreateClientRequest;
import com.rdi.exceptionhandling.dtos.CreateClientResponse;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;


@Service
public class ClientServiceImpl implements ClientService {
    private final ClientRepository clientRepository;
    private final ModelMapper modelMapper;

    public ClientServiceImpl(ClientRepository clientRepository, ModelMapper modelMapper) {
        this.clientRepository = clientRepository;
        this.modelMapper = modelMapper;
    }

    @Override
    public CreateClientResponse saveClient(CreateClientRequest createClientRequest) {
        Client client = modelMapper.map(createClientRequest, Client.class);
        Client savedClient = clientRepository.save(client);
        return modelMapper.map(savedClient, CreateClientResponse.class);
    }

//    @Override
//    public List<CreateClientResponse> findAllClients() {
//
//        List<Client> clients = clientRepository.findAll();
//        clients.forEach(el -> {
//            modelMapper.map(el, CreateClientResponse.class);
//
//        });
//        return modelMapper.;
//    }

    @Override
    public CreateClientResponse findByClientId(Long clientId) {
        Client client = clientRepository.findByClientId(clientId);
        return modelMapper.map(client, CreateClientResponse.class);
    }

}
