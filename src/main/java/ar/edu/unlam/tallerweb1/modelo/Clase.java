package ar.edu.unlam.tallerweb1.modelo;

import java.util.Date;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name= "clase")
public class Clase {
	
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	public Long id;
	public String nombreClase;
	public String nombreProfesor;
	public Date fechaYhora;
	public String duracion;
	public Integer cantidadAlumnos;
	
	@ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.PERSIST)
	@JoinColumn(name = "clase_profesor", nullable = false)
	private Usuario profesor;
	
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "claseUsuario",
	joinColumns = {@JoinColumn(name = "claseId", referencedColumnName = "id")},
	inverseJoinColumns = {@JoinColumn(name = "usuarioId", referencedColumnName = "id")})
	private Set<Usuario> usuario;

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

	public Usuario getProfesor() {
		return profesor;
	}

	public void setProfesor(Usuario profesor) {
		this.profesor = profesor;
	}

	public Set<Usuario> getUsuario() {
		return usuario;
	}

	public void setUsuario(Set<Usuario> usuario) {
		this.usuario = usuario;
	}

	
	
}
