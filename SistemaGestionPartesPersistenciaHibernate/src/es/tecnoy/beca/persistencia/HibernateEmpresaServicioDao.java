package es.tecnoy.beca.persistencia;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import es.tecnoy.beca.entidades.EmpresaServicio;
import es.tecnoy.beca.persistencia.interfaces.EmpresaServicioDao;
import es.tecnoy.beca.utilidades.hibernate.HibernateContextoPersistencia;

public class HibernateEmpresaServicioDao extends HibernateAbstractDao implements EmpresaServicioDao{

<<<<<<< HEAD
	public HibernateEmpresaServicioDao(HibernateContextoPersistencia cp) {
		super();
		this.getCp();
	}

	@Override
	public void add(EmpresaServicio entidad) {
		Session session = getCp().getSesionActual();
=======
	private HibernateContextoPersistencia cp;

	@Override
	public void add(EmpresaServicio entidad) {
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
	public void edit(EmpresaServicio entidad) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Todavia no esta implementado");
		
	}

	@Override
	public EmpresaServicio query(Integer codigo) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Todavia no esta implementado");
		//return null;
	}

	@Override
	public List<EmpresaServicio> query() {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Todavia no esta implementado");
		//return null;
	}

}
