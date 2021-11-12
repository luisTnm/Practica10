package com.cursoapi.ejercicio10.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cursoapi.ejercicio10.entities.Libro;


public interface LibroRepository extends JpaRepository<Libro, Integer>{

}