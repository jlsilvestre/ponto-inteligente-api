package com.silvestre.ponto.api.services.impl;

import java.io.Serializable;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.silvestre.ponto.api.entities.Empresa;
import com.silvestre.ponto.api.repositories.EmpresaRepository;
import com.silvestre.ponto.api.services.EmpresaService;

@Service
public class EmpresaServiceImpl implements EmpresaService{

	private static final Logger log = LoggerFactory.getLogger(EmpresaServiceImpl.class);
	
	@Autowired
	private EmpresaRepository empresaRepository;

	@Override
	public Optional<Empresa> buscarPorCnpj(String cnpj) {
		log.info("Buscando uma empresa pelo cnpj {} ", cnpj);
		return Optional.ofNullable(empresaRepository.findByCnpj(cnpj));
	}

	@Override
	public Empresa persistir(Empresa empresa) {
		log.info("Persistindo Empresa : {} ", empresa);
		return this.empresaRepository.save(empresa);
	}
	
}
