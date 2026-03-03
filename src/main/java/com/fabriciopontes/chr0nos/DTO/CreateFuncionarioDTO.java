package com.fabriciopontes.chr0nos.DTO;

public class CreateFuncionarioDTO {
    private String fullName;
    private String email;
    private String password;

    //DTO constructor
    public CreateFuncionarioDTO(String fullName, String email, String password) {
        this.fullName = fullName;
        this.email = email;
        this.password = password;
    }

    public String getFullName() {
        return fullName;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }
}
