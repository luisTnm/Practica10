package com.cursoapi.ejercicio10.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cursoapi.ejercicio10.entities.Usuario;


public interface UsuarioRepository extends JpaRepository<Usuario, Integer>{

}