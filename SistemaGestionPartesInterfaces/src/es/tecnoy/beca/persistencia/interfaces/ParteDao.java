package es.tecnoy.beca.persistencia.interfaces;

import java.util.Date;
import java.util.List;

import es.tecnoy.beca.entidades.Parte;

public interface ParteDao extends Dao<Parte, Integer> {

	// Anteriores a una fecha de inicio
	List<Parte> queryBefore(Date fechaInicio);

	// Posteriores a una fecha de inicio
	List<Parte> queryAfter(Date fechaInicio);

	void updateWhereEstadoNoAprobado(Parte entidad);

	// List<Parte> queryBetween(Date fechaInicio, Date fechaFin);
	// List<Parte> queryPendientes();

}
