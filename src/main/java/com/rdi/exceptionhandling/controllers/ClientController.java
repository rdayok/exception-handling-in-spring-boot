package com.rdi.exceptionhandling.controllers;

import com.rdi.exceptionhandling.dtos.CreateClientRequest;
import com.rdi.exceptionhandling.dtos.CreateClientResponse;
import com.rdi.exceptionhandling.services.ClientService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/clients")
public class ClientController {
    private final ClientService clientService;

    public ClientController(ClientService clientService) {
        this.clientService = clientService;
    }

    // The @Valid annotation in this method tell spring to make sure our validation specified in out Request DTO should be checked
    @PostMapping("/signup")
    public ResponseEntity<CreateClientResponse> creatClient(@RequestBody  CreateClientRequest createClientRequest) {
        CreateClientResponse createClientResponse = clientService.saveClient(createClientRequest);
        return new ResponseEntity<>(createClientResponse, HttpStatus.OK);
    }

//    @GetMapping
//    public ResponseEntity<List<CreateClientResponse>> getAllClients() {
//        List<CreateClientResponse> createClientResponses = clientService.findAllClients();
//        return new ResponseEntity<>(createClientResponses, HttpStatus.FOUND);
//    }

    @GetMapping("/{id}")
    public ResponseEntity<CreateClientResponse> getClient( @PathVariable Long id) {
        CreateClientResponse createClientResponse = clientService.findByClientId(id);
        return new ResponseEntity<>(createClientResponse, HttpStatus.FOUND);
    }
}
