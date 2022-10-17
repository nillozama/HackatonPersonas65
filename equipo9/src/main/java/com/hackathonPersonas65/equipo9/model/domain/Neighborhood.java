package com.hackathonPersonas65.equipo9.model.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name="barris")

public class Neighborhood {
	
	@Id
	//@GeneratedValue (strategy=GenerationType.IDENTITY)
	@Column (name="id")
	private String id;
	@Column (name="poblacion")
	private double poblacion;
	@Column (name="densidad")
	private double densidad;
	@Column (name="poblacion_mas_65")
	private float poblacionMas65;
	@Column (name="titulados_sup")
	private float tituladosSup;
	@Column (name="poblacion_sola")
	private float poblacionSola;
	@Column (name="indice_sobreenv")
	private float indiceSobreenv;
	@Column (name="renta_familiar")
	private float rentaFamiliar;
	@Column (name="CODI_DIVISIO_TERRITORIAL")
	private String codiDivisioTerritorial;
	@Column (name="CODI_DIVISIO_TERRITORIAL_PARE")
	private String codiDivisioTerritorialPare;
	@Column (name="NOM_DIVISIO_TERRITORIAL")
	private String nomDivisioTerritorial;
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public double getPoblacion() {
		return poblacion;
	}
	public void setPoblacion(double poblacion) {
		this.poblacion = poblacion;
	}
	public double getDensidad() {
		return densidad;
	}
	public void setDensidad(double densidad) {
		this.densidad = densidad;
	}
	
	public float getPoblacionMas65() {
		return poblacionMas65;
	}
	public void setPoblacionMas65(float poblacionMas65) {
		this.poblacionMas65 = poblacionMas65;
	}
	public float getTituladosSup() {
		return tituladosSup;
	}
	public void setTituladosSup(float tituladosSup) {
		this.tituladosSup = tituladosSup;
	}
	public float getPoblacionSola() {
		return poblacionSola;
	}
	public void setPoblacionSola(float poblacionSola) {
		this.poblacionSola = poblacionSola;
	}
	public float getIndiceSobreenv() {
		return indiceSobreenv;
	}
	public void setIndiceSobreenv(float indiceSobreenv) {
		this.indiceSobreenv = indiceSobreenv;
	}
	public float getRentaFamiliar() {
		return rentaFamiliar;
	}
	public void setRentaFamiliar(float rentaFamiliar) {
		this.rentaFamiliar = rentaFamiliar;
	}
	public String getCodiDivisioTerritorial() {
		return codiDivisioTerritorial;
	}
	public void setCodiDivisioTerritorial(String codiDivisioTerritorial) {
		this.codiDivisioTerritorial = codiDivisioTerritorial;
	}
	public String getCodiDivisioTerritorialPare() {
		return codiDivisioTerritorialPare;
	}
	public void setCodiDivisioTerritorialPare(String codiDivisioTerritorialPare) {
		this.codiDivisioTerritorialPare = codiDivisioTerritorialPare;
	}
	public String getNomDivisioTerritorial() {
		return nomDivisioTerritorial;
	}
	public void setNomDivisioTerritorial(String nomDivisioTerritorial) {
		this.nomDivisioTerritorial = nomDivisioTerritorial;
	}
}
