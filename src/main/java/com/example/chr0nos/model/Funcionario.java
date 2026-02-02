package com.example.chr0nos.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Funcionario {

    //Atributos para definir o trabalhador
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String firstName;
    private String surname;

    // Controladores da entidade
    public Funcionario() {
    }
    public Funcionario(String firstName, String surname) {
        this.firstName = firstName;
        this.surname = surname;
    }

    //Getters and setters da entidade worker
    public String getName() {
        return firstName;
    }

    public void setName(String name) {
        this.firstName = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Long getId() {
        return id;
    }

}
