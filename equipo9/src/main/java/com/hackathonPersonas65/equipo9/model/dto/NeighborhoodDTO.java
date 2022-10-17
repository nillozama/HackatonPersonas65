package com.hackathonPersonas65.equipo9.model.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class NeighborhoodDTO {
	
	@JsonProperty("Nombre_Barrio")
	private int nomDivisioTerritorial;
	@JsonProperty("Numero_Poblacion")
	private int poblacion;
	@JsonProperty("Poblacion_Mas_65")
	private float poblacionMas65;
	@JsonProperty("Titulados_Sup")
	private float tituladosSup;
	@JsonProperty("Poblacion_Sola")
	private float poblacionSola;
	@JsonProperty("Renta_Familiar")
	private float rentaFamiliar;
	@JsonProperty("Indice_Sobreenv")
	private float indiceSobreenv;
	
	
	public int getNomDivisioTerritorial() {
		return nomDivisioTerritorial;
	}
	public void setNomDivisioTerritorial(int nomDivisioTerritorial) {
		this.nomDivisioTerritorial = nomDivisioTerritorial;
	}
	public int getPoblacion() {
		return poblacion;
	}
	public void setPoblacion(int poblacion) {
		this.poblacion = poblacion;
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
	public float getRentaFamiliar() {
		return rentaFamiliar;
	}
	public void setRentaFamiliar(float rentaFamiliar) {
		this.rentaFamiliar = rentaFamiliar;
	}
	
	

}
