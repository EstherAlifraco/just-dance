package ar.edu.unlam.tallerweb1.dao;

import java.util.List;

import javax.inject.Inject;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import ar.edu.unlam.tallerweb1.modelo.Clase;

@Repository("ClaseDao")
@SuppressWarnings("unchecked")
public class ClaseDaoImpl implements ClaseDao{

	@Inject
	private SessionFactory sessionFactory;

	@Override
	public List<Clase> consultarClases(){
		final Session session = sessionFactory.getCurrentSession();
		return session.createCriteria(Clase.class)
				.add(Restrictions.isNotNull("id"))
				.list();
}
	
	@Override
	public List<Clase> consultarMisClases(Long idAlumno){
		final Session session = sessionFactory.getCurrentSession();
		return session.createCriteria(Clase.class, "a")
				.createAlias("a.clase", "clasesMias")
				.add(Restrictions.eq("clasesMias.id", idAlumno))
				.list();
}
}
