package ar.edu.unlam.tallerweb1.controladores;

import java.util.List;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import ar.edu.unlam.tallerweb1.modelo.Clase;
import ar.edu.unlam.tallerweb1.modelo.Usuario;
import ar.edu.unlam.tallerweb1.servicios.ServicioClase;
import ar.edu.unlam.tallerweb1.servicios.ServicioUsuario;

@Controller
public class ControladorClase {
	
	@Inject
	private ServicioClase servicioClase;
	
	@Inject
	private ServicioUsuario servicioUsuario;

	
	@RequestMapping("/clase")
	public ModelAndView MostrarClases() {
		ModelMap model = new ModelMap();
		List<Clase> listarClases = servicioClase.consultarClases();
		Clase clases = new Clase();
		
		model.put("listarClases", listarClases);
		model.put("clases", clases);
		return new ModelAndView("clases", model);
	}
	
	@RequestMapping("/misClases/")
	public ModelAndView MostrarMisClases(HttpServletRequest request) {
		
		Long idAlumno = (Long) request.getSession().getAttribute("idAlumno");
		ModelMap model = new ModelMap();
		
		if (idAlumno != null) {
			if (servicioUsuario.buscarPorId(idAlumno).getRol().equals("alumno")) {
				Usuario usuarioLogueado = servicioUsuario.buscarPorId((Long) request.getSession().getAttribute("idAlumno"));
				model.put("usuario", usuarioLogueado);
			
		List<Clase> listarMisClases = servicioClase.consultarMisClases(idAlumno);
		Clase clases = new Clase();
		
		model.put("listarMisClases", listarMisClases);
		model.put("clases", clases);
		
		return new ModelAndView("misClases", model);
	}}
		
			return new ModelAndView("redirect:/login");
		
	}
}
	

