package com.redsocial.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.redsocial.entity.Curso;
import com.redsocial.service.CursoService;

@CrossOrigin(origins="http://localhost:4200",maxAge=3600)
@RestController
@RequestMapping("/api/rest/curso")
public class CursoController {

	@Autowired
	private CursoService service;
	
	@GetMapping("/")
	public ResponseEntity<List<Curso>> lista(){
		return ResponseEntity.ok(service.listaCurso());
	}
	
	@GetMapping("/porNombre/{filtro}")
	public ResponseEntity<List<Curso>> listaPorNombre(@PathVariable String filtro){
		return ResponseEntity.ok(service.listaCursoPorNombre(filtro));
	}
}
