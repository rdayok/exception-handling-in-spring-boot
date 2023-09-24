package com.rdi.exceptionhandling.dtos;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CreateClientRequest {
    private String name;
    private String email;
    private String phoneNumber;
    private String age;
    private String nationality;
}
