package com.silvestre.ponto.api.services;

import java.util.Optional;

import com.silvestre.ponto.api.entities.Empresa;

public interface EmpresaService {

	/**
	 * Retorna uma empresa dado um cnpj
	 * 
	 * @param cnpj
	 * @return Optional<Empresa>
	 */
	
	Optional<Empresa> buscarPorCnpj(String cnpj);
	
	/**
	 * Cadastra uma nova empresa no db
	 * 
	 * @param empresa
	 * @return Empresa
	 */
	
	Empresa persistir(Empresa empresa);
}
