package com.fabriciopontes.chr0nos.service;

import com.fabriciopontes.chr0nos.DTO.CreateFuncionarioDTO;
import com.fabriciopontes.chr0nos.repository.FuncionarioRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.jupiter.api.Assertions.*;

class FuncionarioServiceTest {

    //Mesma estrutura da real, mas na realidade não faz nada
    @Mock
    private FuncionarioRepository funcionarioRepository;

    @InjectMocks
    private FuncionarioService funcionarioService;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    @DisplayName("Should create a worker if everthing is ok")
    void addFuncionarioCase1() {
        CreateFuncionarioDTO dto = new CreateFuncionarioDTO(
                "Fabricio pontes",
                "fabriciopontes@gmail.com",
                "123"
        );
    }

    @Test
    @DisplayName("Should create a worker if everthing is ok")
    void addFuncionarioCase2() {

    }
}