package com.silvestre.ponto.api.services;

import java.util.Optional;

import com.silvestre.ponto.api.entities.Funcionario;

public interface FuncionarioService {

	/**
	 * Cadastra um novo funcionario no db
	 * 
	 * @param funcionario
	 * @return Funcionario
	 */
	
	Funcionario persistir(Funcionario funcionario);
	
	/**
	 * Retorna um funcionario dado um cpf
	 * 
	 * @param cpf
	 * @return Optional<Funcionario>
	 */
	
	Optional<Funcionario> buscarPorCpf(String cpf);
	
	/**
	 * Retorna um funcionario dado um email
	 * 
	 * @param email
	 * @return Optional<Funcionario>
	 */
	
	Optional<Funcionario> buscarPorEmail(String email);
	
	/**
	 * Retorna um funcionario dado um id
	 * 
	 * @param id
	 * @return Optional<Funcionario>
	 */
	
	Optional<Funcionario> buscarPorId(Long id);
	
}
