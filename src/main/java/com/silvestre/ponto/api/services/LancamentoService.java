package com.silvestre.ponto.api.services;

import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

import com.silvestre.ponto.api.entities.Lancamento;

public interface LancamentoService {

	/**
	 * Retorna uma lista paginada dos lancamentos de um determinado funcionario
	 * 
	 * @param id
	 * @return Optional<Lancamento>
	 */
	
	Page<Lancamento> buscarPorFuncionarioId(Long id, PageRequest pageRequest);
	
	/**
	 * Retorna lancamentos dado um id
	 * 
	 * @param id
	 * @return Optional<Lancamento>
	 */
	
	Optional<Lancamento> buscarPorId(Long id);
	
	/**
	 * Cadastra um novo lancamento no db
	 * 
	 * @param lancamento
	 * @return Lancamento
	 */
	
	Lancamento persistir(Lancamento lancamento);
	
	/**
	 * Remove um lancamento do bd
	 * 
	 * @param id
	 */
	
	void remover(Long id);
}
