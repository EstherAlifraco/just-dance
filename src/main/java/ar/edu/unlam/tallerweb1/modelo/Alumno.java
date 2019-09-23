package ar.edu.unlam.tallerweb1.modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Alumno {
	
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	public Long id;
	public String nombreAlumno;
	public String apellidoAlumno;
	public Long dni;
	public String email;
	public String password;

}
