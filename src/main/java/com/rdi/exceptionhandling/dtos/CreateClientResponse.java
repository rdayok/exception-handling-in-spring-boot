package com.rdi.exceptionhandling.dtos;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
// Adding a static method that set all attributes of the Client entity -> "build"
@AllArgsConstructor
@NoArgsConstructor
public class CreateClientResponse {
    private Long id;
    private String name;
    private String email;
    private String phoneNumber;
    private String age;
    private String nationality;
}
