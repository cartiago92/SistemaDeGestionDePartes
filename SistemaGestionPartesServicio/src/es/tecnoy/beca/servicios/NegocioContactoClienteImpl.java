package es.tecnoy.beca.servicios;

import es.tecnoy.beca.entidades.ContactoCliente;
import es.tecnoy.beca.persistencia.interfaces.ContactoClienteDao;
import es.tecnoy.beca.servicio.interfaces.NegocioContactoCliente;

public class NegocioContactoClienteImpl implements NegocioContactoCliente{

	private ContactoClienteDao contactoClienteDao;
	
	public void setContactoClienteDao(ContactoClienteDao contactoClienteDao) {
		this.contactoClienteDao = contactoClienteDao;
	}

	@Override
	public void altaContactoCliente(ContactoCliente servicio) {
		
		this.contactoClienteDao.add(servicio);
	}

}
