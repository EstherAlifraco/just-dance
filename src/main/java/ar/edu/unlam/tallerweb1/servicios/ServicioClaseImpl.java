package ar.edu.unlam.tallerweb1.servicios;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ar.edu.unlam.tallerweb1.dao.ClaseDao;
import ar.edu.unlam.tallerweb1.modelo.Clase;

@Service("ServicioClase")
@Transactional
public class ServicioClaseImpl implements ServicioClase{
	
	
	@Inject
	private ClaseDao servicioClaseDao;

	@Override
	public List<Clase> consultarClases(){
		return servicioClaseDao.consultarClases();
	}
	
	@Override
	public List<Clase> consultarMisClases(Long idAlumno){
		return servicioClaseDao.consultarMisClases(idAlumno);
	}
	
	

}
