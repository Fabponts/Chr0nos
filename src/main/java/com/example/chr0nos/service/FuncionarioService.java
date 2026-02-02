package com.example.chr0nos.service;

import com.example.chr0nos.DTO.FuncionarioDTO;
import com.example.chr0nos.model.Funcionario;
import com.example.chr0nos.repository.FuncionarioRepository;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class FuncionarioService {

    private final FuncionarioRepository funcionarioRepository;

    public FuncionarioService(FuncionarioRepository funcionarioRepository) {
        this.funcionarioRepository = funcionarioRepository;
    }

    //Metodo para adicionar um funcionario com regras.
    public Funcionario addFuncionario(FuncionarioDTO funcionarioDTO) {
        validarFuncionario(funcionarioDTO);
        Funcionario funcionario = criarFuncionario(funcionarioDTO);
        return funcionarioRepository.save(funcionario);
    }

    //Metodo para buscar um funcionario no banco
    public Funcionario updateFuncionario(Long id, FuncionarioDTO dto) {
        Funcionario funcionario = funcionarioRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Funcionario não encontrado"));

        validarFuncionario(dto);
        aplicarUpdate(funcionario, dto);

       return funcionarioRepository.save(funcionario);
    }

    //Metodo para efetuar deleçoes no banco de dados
    public void deleteFuncionario(Long id) {
        Funcionario funcionario = funcionarioRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Funcionário não encontrado"));

        funcionarioRepository.delete(funcionario);
    }

    //Lista todos os funcionarios do banco de dados
    public List<Funcionario> findAllFuncionarios() {
        return funcionarioRepository.findAll();
    }

    public void validarFuncionario(FuncionarioDTO dto) {
        if (dto.getFirstName() == null || dto.getFirstName().isBlank()
                || dto.getSurname() == null || dto.getSurname().isBlank()) {
            throw new IllegalArgumentException("Nome e sobrenome são obrigatórios");
        }
    }

    public Funcionario criarFuncionario(FuncionarioDTO dto) {
        Funcionario funcionario = new Funcionario();
        funcionario.setFirstName(dto.getFirstName().trim());
        funcionario.setSurname(dto.getSurname().trim());
        return funcionario;
    }

    public void aplicarUpdate(Funcionario funcionario, FuncionarioDTO dto) {
        if (dto.getFirstName() != null || dto.getSurname() != null){
            funcionario.setFirstName(dto.getFirstName());
            funcionario.setSurname(dto.getSurname());
        }
    }


}
