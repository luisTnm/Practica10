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

import com.cursoapi.ejercicio10.entities.Libro;
import com.cursoapi.ejercicio10.repos.LibroRepository;


@RestController
public class LibroController {
	
	@Autowired
	LibroRepository repository;
	
	private static final Logger LOGGER = LoggerFactory.getLogger(LibroController.class);
	
	@GetMapping(value="/libros/")
	public List<Libro> getLibro(){
		
		return repository.findAll();
	}
	
	
	@GetMapping(value="/libros/{id}")
	public Libro getLibro(@PathVariable("id") int id) {
		LOGGER.info("finding libro by id: "+id);
		return repository.findById(id).get();
	}
	
	
	@PostMapping(value="/libros/")
	public Libro createLibro(@RequestBody Libro libro) {
		return repository.save(libro);
	}
	
	@PutMapping(value="/libros/")
	public Libro updateLibro(@RequestBody Libro libro) {
		return repository.save(libro);
		
	}
	
	@DeleteMapping(value="/libros/{id}")
	public void deleteLibro(@PathVariable("id") int id) {
		repository.deleteById(id);
	}

}
