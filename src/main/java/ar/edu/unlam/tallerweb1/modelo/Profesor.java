package ar.edu.unlam.tallerweb1.modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Profesor {
	
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	public Long id;
	public String nombreProfesor;
	public String apellidoProfesor;
	public String email;
	public String password;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNombreProfesor() {
		return nombreProfesor;
	}
	public void setNombreProfesor(String nombreProfesor) {
		this.nombreProfesor = nombreProfesor;
	}
	public String getApellidoProfesor() {
		return apellidoProfesor;
	}
	public void setApellidoProfesor(String apellidoProfesor) {
		this.apellidoProfesor = apellidoProfesor;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
}
