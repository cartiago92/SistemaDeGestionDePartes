package es.tecnoy.beca.persistencia;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import es.tecnoy.beca.entidades.Tecnico;
import es.tecnoy.beca.persistencia.interfaces.TecnicoDao;
import es.tecnoy.beca.utilidades.hibernate.HibernateContextoPersistencia;

public class HibernateTecnicoDao extends HibernateAbstractDao implements TecnicoDao{
<<<<<<< HEAD
	

	public HibernateTecnicoDao(HibernateContextoPersistencia cp) {
		super();
		this.getCp();
	}
=======
>>>>>>> e4a2c88fd3ae8eb62738c3f51a44abbb46f487a5

	private HibernateContextoPersistencia cp;
	
	@Override
	public void add(Tecnico entidad) {
<<<<<<< HEAD
		Session session = getCp().getSesionActual();
=======
		Session session = cp.getSesionActual();
>>>>>>> e4a2c88fd3ae8eb62738c3f51a44abbb46f487a5
		
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
