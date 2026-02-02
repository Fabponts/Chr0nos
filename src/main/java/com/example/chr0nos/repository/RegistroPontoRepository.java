package com.example.chr0nos.repository;

import com.example.chr0nos.model.Funcionario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RegistroPontoRepository extends JpaRepository<Funcionario, Long> {
}
