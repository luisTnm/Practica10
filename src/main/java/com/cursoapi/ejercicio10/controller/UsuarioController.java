package com.cursoapi.ejercicio10.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cursoapi.ejercicio10.entities.Usuario;
import com.cursoapi.ejercicio10.repos.UsuarioRepository;


@RestController
public class UsuarioController {
	
	@Autowired
	UsuarioRepository repository;
	
	private static final Logger LOGGER = LoggerFactory.getLogger(UsuarioController.class);

	@GetMapping(value="/usuarios/")
	public List<Usuario> getUsuario(){
		
		return repository.findAll();
	}
	
	
	@GetMapping(value="/usuarios/{id}")
	public Usuario getUsuario(@PathVariable("id") int id) {
		LOGGER.info("finding usuario by id: "+id);
		return repository.findById(id).get();
	}
	
	
	@PostMapping(value="/usuarios/")
	public Usuario createPrestamo(@RequestBody Usuario usuario) {
		return repository.save(usuario);
	}
	
	@PutMapping(value="/usuarios/")
	public Usuario updateUsuario(@RequestBody Usuario usuario) {
		return repository.save(usuario);
		
	}
	
	@DeleteMapping(value="/usuarios/{id}")
	public void deleteUsuario(@PathVariable("id") int id) {
		repository.deleteById(id);
	}
	
	
}
