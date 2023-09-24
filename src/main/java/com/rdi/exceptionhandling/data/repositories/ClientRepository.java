package com.rdi.exceptionhandling.data.repositories;

import com.rdi.exceptionhandling.data.models.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Long> {
    public Client findByClientId(Long id);
}
