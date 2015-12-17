package es.tecnoy.beca.entidades;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="PTR_TECNICOS")
public class Tecnico {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer Codigo;
	
	private String nombre;
	private String apellido;
	private String email;
	private String telefono;
	
	@ManyToOne
	@JoinColumn(name="FK_CODIGO_EMPRESA", referencedColumnName="codigo")
	private EmpresaServicio empresa;
	
	//Cuando pones ManyTomMany puedes ponerlo solo en uno de los extremos y ya lo cogeria
	@ManyToMany(mappedBy="tecnicos")
	private List<Servicio> servicios;

	public Tecnico() {
		super();
	}

	public Tecnico(Integer codigo, String nombre, String apellido, String email, String telefono, EmpresaServicio empresa,
			List<Servicio> servicios) {
		super();
		Codigo = codigo;
		this.nombre = nombre;
		this.apellido = apellido;
		this.email = email;
		this.telefono = telefono;
		this.empresa = empresa;
		this.servicios = servicios;
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

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public EmpresaServicio getEmpresa() {
		return empresa;
	}

	public void setEmpresa(EmpresaServicio empresa) {
		this.empresa = empresa;
	}

	public List<Servicio> getServicios() {
		return servicios;
	}

	public void setServicios(List<Servicio> servicios) {
		this.servicios = servicios;
	}

}