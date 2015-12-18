package es.tecnoy.beca.persistencia;

import java.util.Date;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import es.tecnoy.beca.entidades.Parte;
import es.tecnoy.beca.entidades.Parte.EstadoParte;
import es.tecnoy.beca.persistencia.interfaces.ParteDao;
import es.tecnoy.beca.utilidades.hibernate.HibernateContextoPersistencia;

public class HibernateParteDao extends HibernateAbstractDao implements ParteDao {

<<<<<<< HEAD
	public HibernateParteDao(HibernateContextoPersistencia cp) {
		super();
		this.getCp();
=======
	public HibernateParteDao() {
		super();
	}
	
	public HibernateParteDao(HibernateContextoPersistencia cp) {
		super();
		this.setCp(cp);
>>>>>>> e4a2c88fd3ae8eb62738c3f51a44abbb46f487a5
	}

	@Override
	public void add(Parte entidad) {
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
	public void edit(Parte entidad) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Todavía no está implementado");
	}

	@Override
	public Parte query(Integer codigo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Parte> query() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Parte> queryBefore(Date fechaInicio) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Parte> queryAfter(Date fechaInicio) {
		// TODO Auto-generated method stub
		return null;
	}

	// Consultar si no aprobado = rechazado o rechazado y pendiente
	@Override
	public void updateWhereEstadoNoAprobado(Parte entidad) {

		Session session = getCp().getSesionActual();

		// StringBuilder hql = new StringBuilder("update Parte p set ")
		// .append("p.descripcion = :descripcion, ")
		// .append("p.fechaInicio = :fechaInicio, ")
		// .append("p.fechaFin = :fechaFin, ")
		// .append("p.estado = :estado, ")
		// .append("p.motivoRechazo = :motivoRechazo ")
		// .append("where p.codigo = :codigo and p.estado = :estadoPendiente");
		//
		// Query query = session.createQuery(hql.toString());

		Query query = session.getNamedQuery("updateWhereEstadoNoAprobado");

		query.setParameter("descripcion", entidad.getDescripcion());
		query.setParameter("fechaInicio", entidad.getFechaInicio());
		query.setParameter("fechaFin", entidad.getFechaFin());
		query.setParameter("estado", entidad.getEstado());
		query.setParameter("motivoRechazo", entidad.getMotivoRechazo());
		query.setParameter("codigo", entidad.getCodigo());
		query.setParameter("estadoPendiente", EstadoParte.PENDIENTE);

		int registrosAfectados = query.executeUpdate();

	}

}
