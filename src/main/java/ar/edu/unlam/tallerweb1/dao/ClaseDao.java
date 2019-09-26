package ar.edu.unlam.tallerweb1.dao;

import java.util.List;

import ar.edu.unlam.tallerweb1.modelo.Clase;

public interface ClaseDao {

	List<Clase> consultarClases();
	
	List<Clase> consultarMisClases(Long idAlumno);
}
