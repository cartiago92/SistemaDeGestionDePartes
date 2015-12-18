package es.tecnoy.beca.servicios;

import es.tecnoy.beca.entidades.Servicio;
import es.tecnoy.beca.persistencia.interfaces.ServicioDao;
import es.tecnoy.beca.servicio.interfaces.NegocioServicio;


public class NegocioServicioImpl implements NegocioServicio{

	private ServicioDao servicioDao;
	
	public void setServicioDao(ServicioDao servicioDao) {
		this.servicioDao = servicioDao;
	}

	@Override
	public void altaServicio(Servicio servicio) {
		
		this.servicioDao.add(servicio);
	}

}
