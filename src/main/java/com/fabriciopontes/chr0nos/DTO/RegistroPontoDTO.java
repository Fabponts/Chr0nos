package com.fabriciopontes.chr0nos.DTO;

import com.fabriciopontes.chr0nos.model.TipoRegistro;

import java.time.LocalDateTime;

public class RegistroPontoDTO {
    //Dtos da classe
    private TipoRegistro tipoRegistro;
    private Long funcionarioId;
    private LocalDateTime horario;

    //Getters and Setters dos DTOS
    public TipoRegistro getTipoRegistro() {
        return tipoRegistro;
    }

    public void setTipoRegistro(TipoRegistro tipoRegistro) {
        this.tipoRegistro = tipoRegistro;
    }

    public Long getFuncionarioId() {
        return funcionarioId;
    }

    public void setFuncionarioId(Long funcionarioId) {
        this.funcionarioId = funcionarioId;
    }

    public LocalDateTime getHorario() {
        return horario;
    }

    public void setHorario(LocalDateTime horario) {
        this.horario = horario;
    }
}
