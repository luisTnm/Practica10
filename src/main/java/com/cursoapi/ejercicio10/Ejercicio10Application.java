package com.cursoapi.ejercicio10;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.cursoapi.ejercicio10.controller.LibroController;
import com.cursoapi.ejercicio10.controller.PrestamoController;
import com.cursoapi.ejercicio10.controller.UsuarioController;


@SpringBootApplication
@ComponentScan(basePackageClasses = LibroController.class )
@ComponentScan(basePackageClasses = PrestamoController.class )
@ComponentScan(basePackageClasses = UsuarioController.class )
public class Ejercicio10Application {

	public static void main(String[] args) {
		SpringApplication.run(Ejercicio10Application.class, args);
	}

}
