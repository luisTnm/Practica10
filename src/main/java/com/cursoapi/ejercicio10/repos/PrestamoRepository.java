package com.cursoapi.ejercicio10.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cursoapi.ejercicio10.entities.Prestamo;


public interface PrestamoRepository extends JpaRepository<Prestamo, Integer>{

}