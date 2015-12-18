package es.tecnoy.beca.persistencia;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import es.tecnoy.beca.entidades.Cliente;
import es.tecnoy.beca.persistencia.interfaces.ClienteDao;
import es.tecnoy.beca.utilidades.hibernate.HibernateContextoPersistencia;

public class HibernateClienteDao extends HibernateAbstractDao implements ClienteDao{
	
	public HibernateClienteDao() {
		super();
	}

	public HibernateClienteDao(HibernateContextoPersistencia cp) {
		super();
		this.setCp(cp);
	}
	
	@Override
	public void add(Cliente entidad) {
		Session session = getCp().getSesionActual();
		Integer codigo = (Integer) session.save(entidad);
		session.evict(entidad);
		entidad.setCodigo(codigo);		
	}

	@Override
	public void remove(Integer codigo) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Todavía no está implementado");
	}

	@Override
	public void edit(Cliente entidad) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Todavía no está implementado");
	}

	@Override
	public Cliente query(Integer codigo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Cliente> query() {
		// TODO Auto-generated method stub
		return null;
	}

}
