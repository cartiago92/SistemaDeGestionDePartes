package es.tecnoy.beca.persistencia;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import es.tecnoy.beca.entidades.ContactoCliente;
import es.tecnoy.beca.persistencia.interfaces.ContactoClienteDao;

public class HibernateContactoClienteDao extends HibernateAbstractDao implements ContactoClienteDao{

	public HibernateContactoClienteDao(SessionFactory sf) {
		super();
		this.setSf(sf);
	}
	
	@Override
	public void add(ContactoCliente entidad) {
		Session sesion = getSf().getCurrentSession();
		Integer pk = (Integer) sesion.save(entidad);
		sesion.evict(entidad); // Esto para que al realizar la sesion activa 
		entidad.setCodigo(pk);
		
	}

	@Override
	public void remove(Integer codigo) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Todavia no esta implementado");
		
	}

	@Override
	public void edit(ContactoCliente entidad) {
		Session sesion = getSf().getCurrentSession();
		sesion.update(entidad);
	}
		
	@Override
	public ContactoCliente query(Integer codigo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ContactoCliente> query() {
		// TODO Auto-generated method stub
		return null;
	}

}
