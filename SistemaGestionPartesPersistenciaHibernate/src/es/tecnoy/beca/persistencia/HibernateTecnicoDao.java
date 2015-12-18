package es.tecnoy.beca.persistencia;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import es.tecnoy.beca.entidades.Tecnico;
import es.tecnoy.beca.persistencia.interfaces.TecnicoDao;
import es.tecnoy.beca.utilidades.hibernate.HibernateContextoPersistencia;

public class HibernateTecnicoDao extends HibernateAbstractDao implements TecnicoDao{
	

	public HibernateTecnicoDao(HibernateContextoPersistencia cp) {
		super();
		this.getCp();
	}

	@Override
	public void add(Tecnico entidad) {
		Session session = getCp().getSesionActual();
		
		Integer pk = (Integer) session.save(entidad);
		
		//evict lo que hace es que no se hagan actualizaciones en la base de datos involuntarias
		session.evict(entidad);
		
		entidad.setCodigo(pk);
		
	}

	@Override
	public void remove(Integer codigo) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void edit(Tecnico entidad) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Tecnico query(Integer codigo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Tecnico> query() {
		// TODO Auto-generated method stub
		return null;
	}

	
}
