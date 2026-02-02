package com.example.chr0nos.model;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
public class RegistroPonto {

    //Entidades da classe
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private Funcionario funcionario;

    @Enumerated(EnumType.STRING)
    private TipoRegistro tipoRegistro;

    private LocalDateTime momentoRegistro;

    //Construtores da classe
    public RegistroPonto() {
    }

    public RegistroPonto(Funcionario funcionario, TipoRegistro tipoRegistro, LocalDateTime momentoRegistro) {
        this.funcionario = funcionario;
        this.tipoRegistro = tipoRegistro;
        this.momentoRegistro = momentoRegistro;
    }

    //Getters and setters
    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    public TipoRegistro getTipoRegistro() {
        return tipoRegistro;
    }

    public void setTipoRegistro(TipoRegistro tipoRegistro) {
        this.tipoRegistro = tipoRegistro;
    }

    public LocalDateTime getDataRegistroPonto() {
        return momentoRegistro;
    }

    public void setDataRegistroPonto(LocalDateTime dataRegistroPonto) {
        this.momentoRegistro = dataRegistroPonto;
    }
}
