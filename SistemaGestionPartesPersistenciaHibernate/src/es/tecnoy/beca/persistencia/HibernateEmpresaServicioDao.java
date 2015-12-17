package es.tecnoy.beca.persistencia;

import java.util.Date;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import es.tecnoy.beca.entidades.EmpresaServicio;
import es.tecnoy.beca.persistencia.interfaces.EmpresaServicioDao;

public class HibernateEmpresaServicioDao extends HibernateAbstractDao implements EmpresaServicioDao{

	public HibernateEmpresaServicioDao(SessionFactory sf) {
		super();
		this.setSf(sf);
	}

	@Override
	public void add(EmpresaServicio entidad) {
		Session session = getSf().getCurrentSession();
		
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
	public void edit(EmpresaServicio entidad) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public EmpresaServicio query(Integer codigo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<EmpresaServicio> query() {
		// TODO Auto-generated method stub
		return null;
	}

}
