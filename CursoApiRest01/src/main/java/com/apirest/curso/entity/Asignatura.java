package com.apirest.curso.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
//commit 04- para asignatura
//Asignaturas es como Materias
@Entity
@Table(name="asig_asignaturas", schema="public")
public class Asignatura implements Serializable{
	
	private static final long serialVersionUID = 4983097977180839894L;

	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	@Column(name ="asig_codigo")	
    private Integer idCodigo;

	@Column(name ="titu_codigo")	
    private Integer idCodigoTitu;

	@Column(name ="asig_nombre", length = 200)
	private String asigNombre;
	
	@Column(name ="asig_nro_creditos")
	private Double asigNroCreditos;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="titu_codigo"  , nullable = false, insertable = false, updatable = false)
	private Titulacion titulacion;
	
	@Column(name ="asig_fch_creacion")
	private Date asigFechaCreacion;

	@Column(name ="asig_fch_modificacion" )
	private Date asigFechaModificacion;

	@Column(name ="asig_usu_creacion", length = 100)
	private String asigUsuarioCreacion;
	 
	@Column(name ="asig_usu_modificacion", length = 100)
	private String asigUsuarioModificacion;

	public Asignatura() {
	}

	public Asignatura(Integer idCodigo, Integer idCodigoTitu, String asigNombre, Double asigNroCreditos) {
		super();
		this.idCodigo = idCodigo;
		this.idCodigoTitu = idCodigoTitu;
		this.asigNombre = asigNombre;
		this.asigNroCreditos = asigNroCreditos;
	}


	public Integer getIdCodigo() {
		return idCodigo;
	}

	public void setIdCodigo(Integer idCodigo) {
		this.idCodigo = idCodigo;
	}

	public Integer getIdCodigoTitu() {
		return idCodigoTitu;
	}

	public void setIdCodigoTitu(Integer idCodigoTitu) {
		this.idCodigoTitu = idCodigoTitu;
	}

	public String getAsigNombre() {
		return asigNombre;
	}

	public void setAsigNombre(String asigNombre) {
		this.asigNombre = asigNombre;
	}

	public Double getAsigNroCreditos() {
		return asigNroCreditos;
	}

	public void setAsigNroCreditos(Double asigNroCreditos) {
		this.asigNroCreditos = asigNroCreditos;
	}

	public Titulacion getTitulacion() {
		return titulacion;
	}

	public void setTitulacion(Titulacion titulacion) {
		this.titulacion = titulacion;
	}

	public Date getAsigFechaCreacion() {
		return asigFechaCreacion;
	}

	public void setAsigFechaCreacion(Date asigFechaCreacion) {
		this.asigFechaCreacion = asigFechaCreacion;
	}

	public Date getAsigFechaModificacion() {
		return asigFechaModificacion;
	}

	public void setAsigFechaModificacion(Date asigFechaModificacion) {
		this.asigFechaModificacion = asigFechaModificacion;
	}

	public String getAsigUsuarioCreacion() {
		return asigUsuarioCreacion;
	}

	public void setAsigUsuarioCreacion(String asigUsuarioCreacion) {
		this.asigUsuarioCreacion = asigUsuarioCreacion;
	}

	public String getAsigUsuarioModificacion() {
		return asigUsuarioModificacion;
	}

	public void setAsigUsuarioModificacion(String asigUsuarioModificacion) {
		this.asigUsuarioModificacion = asigUsuarioModificacion;
	}

	
}
