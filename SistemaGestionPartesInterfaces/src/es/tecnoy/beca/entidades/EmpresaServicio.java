package es.tecnoy.beca.entidades;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="PTR_TECNICOS")
public class EmpresaServicio {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer Codigo;
	
	private String nombre;
	
	@Column(columnDefinition="text")
	private String descripcion;
	
	private String web;
	
	@Embedded
	private Domicilio domicilio;
	
	@Column(columnDefinition="text")
	private String observaciones;
	
	@OneToMany(mappedBy = "empresa", cascade= {CascadeType.ALL} /* ,fetch=FetchType.EAGER */)
	private List<Tecnico> tecnico;
	
	
	//Hibernate siempre necesita el constructor por defecto por la sessiones
	public EmpresaServicio() {
		super();
	}

	public EmpresaServicio(Integer codigo, String nombre, String descripcion, String web, Domicilio domicilio,
			String observaciones, List<Tecnico> tecnico) {
		super();
		Codigo = codigo;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.web = web;
		this.domicilio = domicilio;
		this.observaciones = observaciones;
		this.tecnico = tecnico;
	}

	public Integer getCodigo() {
		return Codigo;
	}

	public void setCodigo(Integer codigo) {
		Codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getWeb() {
		return web;
	}

	public void setWeb(String web) {
		this.web = web;
	}

	public Domicilio getDomicilio() {
		return domicilio;
	}

	public void setDomicilio(Domicilio domicilio) {
		this.domicilio = domicilio;
	}

	public String getObservaciones() {
		return observaciones;
	}

	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
	}

	public List<Tecnico> getTecnico() {
		return tecnico;
	}

	public void setTecnico(List<Tecnico> tecnico) {
		this.tecnico = tecnico;
	}
	
	
}