package com.cursoapi.ejercicio10.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Prestamo {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	@Column(name="idLibro")
	private String idLibro;
	@Column(name="idUsuario")
	private String idUsuario;
	@Column(name="fechaPrest")
	private String fechaPrest;
	@Column(name="fechaEntreg")
	private String fechaEntreg;
	
	public Prestamo() {}

	public Prestamo(int id, String idLibro, String idUsuario, String fechaPrest, String fechaEntreg) {
		super();
		this.id = id;
		this.idLibro = idLibro;
		this.idUsuario = idUsuario;
		this.fechaPrest = fechaPrest;
		this.fechaEntreg = fechaEntreg;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getIdLibro() {
		return idLibro;
	}

	public void setIdLibro(String idLibro) {
		this.idLibro = idLibro;
	}

	public String getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(String idUsuario) {
		this.idUsuario = idUsuario;
	}

	public String getFechaPrest() {
		return fechaPrest;
	}

	public void setFechaPrest(String fechaPrest) {
		this.fechaPrest = fechaPrest;
	}

	public String getFechaEntreg() {
		return fechaEntreg;
	}

	public void setFechaEntreg(String fechaEntreg) {
		this.fechaEntreg = fechaEntreg;
	}

	@Override
	public String toString() {
		return "Prestamo [id=" + id + ", idLibro=" + idLibro + ", idUsuario=" + idUsuario + ", fechaPrest=" + fechaPrest
				+ ", fechaEntreg=" + fechaEntreg + "]";
	}
	
	

}
