package es.tecnoy.beca.entidades;

import javax.persistence.Column;
import javax.persistence.Embeddable;

//Se empotra en la tabla, por eso no es entity

@Embeddable
public class Domicilio {

	private String localidad;
	private String calle;
	private String numero;
	@Column(name = "codigo_postal")
	private String codigoPostal;
	
	public Domicilio() {
		super();
	}

	public Domicilio(String localidad, String calle, String numero, String codigoPostal) {
		super();
		this.localidad = localidad;
		this.calle = calle;
		this.numero = numero;
		this.codigoPostal = codigoPostal;
	}

	public String getLocalidad() {
		return localidad;
	}

	public void setLocalidad(String localidad) {
		this.localidad = localidad;
	}

	public String getCalle() {
		return calle;
	}

	public void setCalle(String calle) {
		this.calle = calle;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getCodigoPostal() {
		return codigoPostal;
	}

	public void setCodigoPostal(String codigoPostal) {
		this.codigoPostal = codigoPostal;
	}
	
	
	
	
	
	
}
