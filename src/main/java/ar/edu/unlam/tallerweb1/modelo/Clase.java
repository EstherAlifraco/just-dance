package ar.edu.unlam.tallerweb1.modelo;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Clase {
	
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	public Long id;
	public String nombreClase;
	public String nombreProfesor;
	public Date fechaYhora;
	public String duracion;
	public Integer cantidadAlumnos;
	
	@ManyToOne
	private Profesor profesor;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNombreClase() {
		return nombreClase;
	}
	public void setNombreClase(String nombreClase) {
		this.nombreClase = nombreClase;
	}
	public String getNombreProfesor() {
		return nombreProfesor;
	}
	public void setNombreProfesor(String nombreProfesor) {
		this.nombreProfesor = nombreProfesor;
	}
	public Date getFechaYhora() {
		return fechaYhora;
	}
	public void setFechaYhora(Date fechaYhora) {
		this.fechaYhora = fechaYhora;
	}
	public String getDuracion() {
		return duracion;
	}
	public void setDuracion(String duracion) {
		this.duracion = duracion;
	}
	public Integer getCantidadAlumnos() {
		return cantidadAlumnos;
	}
	public void setCantidadAlumnos(Integer cantidadAlumnos) {
		this.cantidadAlumnos = cantidadAlumnos;
	}
	
}
