package es.tecnoy.beca.interfaces;

import java.util.List;

//Metodos comunes para todas las entidades
public interface Dao<E,K> {

	 void add (E entidad);
	 
	 void remove (K codigo);
	 
	 void edit (E entidad);
	 
	 //Estas habia que examinar si son necesarias
	 E query(K codigo);
	 
	 List<E> query();
	 
}
