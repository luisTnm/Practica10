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

import com.cursoapi.ejercicio10.entities.Prestamo;
import com.cursoapi.ejercicio10.repos.PrestamoRepository;


@RestController
public class PrestamoController {
	
	@Autowired
	PrestamoRepository repository;
	
	private static final Logger LOGGER = LoggerFactory.getLogger(PrestamoController.class);
	

	@GetMapping(value="/prestamo/")
	public List<Prestamo> getPrestamo(){
		
		return repository.findAll();
	}
	
	
	@GetMapping(value="/prestamo/{id}")
	public Prestamo getPrestamo(@PathVariable("id") int id) {
		LOGGER.info("finding prestamo by id: "+id);
		return repository.findById(id).get();
	}
	
	
	@PostMapping(value="/prestamo/")
	public Prestamo createPrestamo(@RequestBody Prestamo prestamo) {
		return repository.save(prestamo);
	}
	
	@PutMapping(value="/prestamo/")
	public Prestamo updatePrestamo(@RequestBody Prestamo prestamo) {
		return repository.save(prestamo);
		
	}
	
	@DeleteMapping(value="/prestamo/{id}")
	public void deletePrestamo(@PathVariable("id") int id) {
		repository.deleteById(id);
	}
	

}
