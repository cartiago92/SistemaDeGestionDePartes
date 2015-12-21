package es.tecnoy.beca.servicio;

import es.tecnoy.beca.entidades.Tecnico;
import es.tecnoy.beca.persistencia.interfaces.NegocioTecnico;
import es.tecnoy.beca.persistencia.interfaces.TecnicoDao;

public class NegocioImplTecnico implements NegocioTecnico{

	private TecnicoDao tecnicoDao;

	public void setTecnicoDao(TecnicoDao tecnicoDao) {
		this.tecnicoDao = tecnicoDao;
	}
	
	public void altaTecnico(Tecnico tecnico){
		tecnicoDao.add(tecnico);
	}
}
