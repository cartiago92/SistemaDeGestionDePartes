package es.tecnoy.beca.persistencia;

import org.hibernate.SessionFactory;

public abstract class HibernateAbstractDao {

	private SessionFactory sf;

	public HibernateAbstractDao() {
		super();
	}

	public void setSf(SessionFactory sf) {
		this.sf = sf;
	}

	public SessionFactory getSf() {
		return sf;
	}

}