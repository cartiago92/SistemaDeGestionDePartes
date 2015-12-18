package es.tecnoy.beca.persistencia;

import java.util.List;

import org.hibernate.Session;

import es.tecnoy.beca.entidades.Tecnico;
import es.tecnoy.beca.persistencia.interfaces.TecnicoDao;
import es.tecnoy.beca.utilidades.hibernate.HibernateContextoPersistencia;

public class HibernateTecnicoDao extends HibernateAbstractDao implements TecnicoDao{

	private HibernateContextoPersistencia cp;
	
	@Override
	public void add(Tecnico entidad) {
		Session session = cp.getSesionActual();
		
		Integer pk = (Integer) session.save(entidad);
		
		//evict lo que hace es que no se hagan actualizaciones en la base de datos involuntarias
		session.evict(entidad);
		
		entidad.setCodigo(pk);
		
	}

	@Override
	public void remove(Integer codigo) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Todavia no esta implementado");
		
	}

	@Override
	public void edit(Tecnico entidad) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Todavia no esta implementado");
		
	}

	@Override
	public Tecnico query(Integer codigo) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Todavia no esta implementado");
		//return null;
	}

	@Override
	public List<Tecnico> query() {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Todavia no esta implementado");
		//return null;
	}

	
}
