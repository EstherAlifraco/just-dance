package ar.edu.unlam.tallerweb1.servicios;

import java.util.List;


import ar.edu.unlam.tallerweb1.modelo.Clase;


public interface ServicioClase {
	
 List<Clase> consultarClases();
 
 List<Clase> consultarMisClases(Long idAlumno);
		

}
