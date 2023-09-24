package com.rdi.exceptionhandling.dtos;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

// Adding a static method that set all attributes of the Client entity -> "build"
@AllArgsConstructor(staticName = "build")
@NoArgsConstructor
public class CreateClientResponse {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private String email;
    private String phoneNumber;
    private String age;
    private String nationality;
}
