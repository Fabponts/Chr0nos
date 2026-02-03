package com.example.chr0nos.service;


import com.example.chr0nos.repository.FuncionarioRepository;
import com.example.chr0nos.repository.RegistroPontoRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class RegistroPontoService {
    private final RegistroPontoRepository registroPontoRepository;
    private final FuncionarioRepository funcionarioRepository;

    public RegistroPontoService(RegistroPontoRepository registroPontoRepository,  FuncionarioRepository funcionarioRepository) {
        this.registroPontoRepository = registroPontoRepository;
        this.funcionarioRepository = funcionarioRepository;
    }

}
