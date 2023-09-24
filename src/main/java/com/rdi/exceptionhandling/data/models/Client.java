package com.rdi.exceptionhandling.data.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
// Adding a static method that set all attributes of the Client entity -> "build"
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "CLIENT")
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long clientId;
    @NotNull(message = "please fill in your name")
    @NotBlank(message = "please fill in your name")
    private String name;
    private String email;
    private String phoneNumber;
    private String age;
    private String nationality;
}
