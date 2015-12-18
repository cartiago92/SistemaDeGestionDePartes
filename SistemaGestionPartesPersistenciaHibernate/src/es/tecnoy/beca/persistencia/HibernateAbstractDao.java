package es.tecnoy.beca.persistencia;

import es.tecnoy.beca.utilidades.hibernate.HibernateContextoPersistencia;

public abstract class HibernateAbstractDao {

	private HibernateContextoPersistencia cp;

	public HibernateContextoPersistencia getCp() {
		return cp;
	}

	public void setCp(HibernateContextoPersistencia cp) {
		this.cp = cp;
	}
}