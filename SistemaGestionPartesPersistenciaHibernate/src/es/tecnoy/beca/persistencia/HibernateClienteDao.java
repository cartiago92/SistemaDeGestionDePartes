package es.tecnoy.beca.persistencia;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import es.tecnoy.beca.entidades.Cliente;
import es.tecnoy.beca.persistencia.interfaces.ClienteDao;

public class HibernateClienteDao extends HibernateAbstractDao implements ClienteDao{

	public HibernateClienteDao(SessionFactory sf) {
		super();
		this.setSf(sf);
	}
	
	@Override
	public void add(Cliente entidad) {
		Session session = getSf().getCurrentSession();
		Integer codigo = (Integer) session.save(entidad);
		session.evict(entidad);
		entidad.setCodigo(codigo);		
	}

	@Override
	public void remove(Integer codigo) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Todav�a no est� implementado");
	}

	@Override
	public void edit(Cliente entidad) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Todav�a no est� implementado");
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