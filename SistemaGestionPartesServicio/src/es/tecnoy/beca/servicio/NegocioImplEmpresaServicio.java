package es.tecnoy.beca.servicio;

import es.tecnoy.beca.entidades.EmpresaServicio;
import es.tecnoy.beca.persistencia.interfaces.EmpresaServicioDao;
import es.tecnoy.beca.persistencia.interfaces.NegocioEmpresaServicio;

public class NegocioImplEmpresaServicio implements NegocioEmpresaServicio{
	
	private EmpresaServicioDao empresaDao;

	public void setEmpresaDao(EmpresaServicioDao empresa) {
		this.empresaDao = empresa;
	}
	
	public void altaEmpresa (EmpresaServicio empresa){
		empresaDao.add(empresa);
	}

}
