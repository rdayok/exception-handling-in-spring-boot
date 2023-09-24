package com.rdi.exceptionhandling.data.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
// Adding a static method that set all attributes of the Client entity -> "build"
@AllArgsConstructor(staticName = "build")
@NoArgsConstructor
@Table(name = "CLIENT")
public class Client {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private String email;
    private String phoneNumber;
    private String age;
    private String nationality;
}
