package com.fabriciopontes.chr0nos.repository;

import com.fabriciopontes.chr0nos.model.Funcionario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RegistroPontoRepository extends JpaRepository<Funcionario, Long> {
}
