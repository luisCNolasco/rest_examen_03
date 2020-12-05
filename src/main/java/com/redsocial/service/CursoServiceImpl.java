package com.redsocial.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.redsocial.entity.Curso;
import com.redsocial.repository.CursoRepository;

@Service
public class CursoServiceImpl implements CursoService {

	@Autowired
	private CursoRepository repository;

	@Override
	public List<Curso> listaCurso() {
		return repository.findAll();
	}

	@Override
	public List<Curso> listaCursoPorNombre(String nombre) {
		return repository.listaPorNombre(nombre);
	}
	
}


