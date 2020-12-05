package com.redsocial.service;

import java.util.List;

import com.redsocial.entity.Curso;

public interface CursoService {

	public List<Curso> listaCurso();
	public List<Curso> listaCursoPorNombre(String nombre);
}
