package es.tecnoy.beca.persistencia;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import es.tecnoy.beca.entidades.ContactoCliente;
import es.tecnoy.beca.persistencia.interfaces.ContactoClienteDao;
import es.tecnoy.beca.utilidades.hibernate.HibernateContextoPersistencia;

public class HibernateContactoClienteDao extends HibernateAbstractDao implements ContactoClienteDao{

	private HibernateContextoPersistencia cp;
	
	
	public HibernateContactoClienteDao() {
		super();
		// TODO Auto-generated constructor stub
	}

	public HibernateContactoClienteDao(HibernateContextoPersistencia cp) {
		super();
		this.setCp(cp);
	}
	
	@Override
	public void add(ContactoCliente entidad) {
		Session sesion = getCp().getSesionActual();
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
		Session sesion = getCp().getSesionActual();
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
