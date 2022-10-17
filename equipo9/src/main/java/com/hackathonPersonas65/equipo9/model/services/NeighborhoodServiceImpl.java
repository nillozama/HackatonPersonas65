package com.hackathonPersonas65.equipo9.model.services;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.hackathonPersonas65.equipo9.model.domain.Neighborhood;

@Service
public class NeighborhoodServiceImpl implements NeighborhoodService {

	private final Path rootFolder = Paths.get("src/main/resources/");

	@Override
	public List<Neighborhood> getAllNeighborhoods(String csvFile) throws IOException {

		List<Neighborhood> neighborhoods = new ArrayList<Neighborhood>();

		FileReader fr = new FileReader(new File("src/main/resources/" + csvFile));
		BufferedReader br = new BufferedReader(fr);
		String line = br.readLine();
		String[] parts;
		Neighborhood neighborhood;
		String id;
		float poblacion;
		float densidad;
		float poblacionMas65;
		float tituladosSup;
		float poblacionSola;
		float indiceSobreenv;
		float rentaFamiliar;
		int codiDivisioTerritorial;
		int codiDivisioTerritorialPare;
		int nomDivisioTerritorial;
		
		
		line = br.readLine();

		while (line != null) {
			
			neighborhood = new Neighborhood();

			parts = line.split(";");

			try {
				neighborhood.setId( parts[0].trim());
				//id= parts[0].trim();
			} catch (Exception e) {

				id= "Unknown";

			}
			try {

				neighborhood.setPoblacion(Double.valueOf(parts[1].trim()));
				//poblacion= Float.valueOf(parts[1].trim());
			} catch (Exception e) {

				poblacion = 0;
			}
			try {

				neighborhood.setDensidad(Double.valueOf(parts[2].trim()));
				//densidad= Float.valueOf(parts[2].trim());
			} catch (Exception e) {

				densidad = 0;
			}

			try {
				
				neighborhood.setPoblacionMas65(Float.valueOf(parts[3].trim()));

				//poblacionMas65 = Float.valueOf(parts[3].trim());
			} catch (Exception e) {

				poblacionMas65 = 0.0f;
			}

			try {

				neighborhood.setTituladosSup(Float.valueOf(parts[4].trim()));
				//tituladosSup = Float.valueOf(parts[4].trim());
			} catch (Exception e) {

				tituladosSup = 0;
			}
			
			try {

				neighborhood.setPoblacionSola(Float.valueOf(parts[5].trim()));
				//poblacionSola = Float.valueOf(parts[5].trim());
			} catch (Exception e) {

				poblacionSola = 0;
			}
			
			try {

				neighborhood.setIndiceSobreenv(Float.valueOf(parts[6].trim()));
				//indiceSobreenv = Float.valueOf(parts[6].trim());
			} catch (Exception e) {

				indiceSobreenv = 0;
			}
			
			try {
				
				neighborhood.setRentaFamiliar(Float.valueOf(parts[7].trim()));

				//rentaFamiliar = Float.valueOf(parts[7].trim());
			} catch (Exception e) {

				rentaFamiliar = 0;
			}
			
			try {
				
				neighborhood.setCodiDivisioTerritorial(parts[8].trim());

				//codiDivisioTerritorial= parts[8].trim();
			} catch (Exception e) {

				codiDivisioTerritorial = 0;
			}
			
			try {
				
				neighborhood.setCodiDivisioTerritorialPare(parts[5].trim());

				//codiDivisioTerritorialPare= parts[9].trim();
			} catch (Exception e) {

				codiDivisioTerritorialPare = 0;
			}
			
			try {
				
				neighborhood.setNomDivisioTerritorial(parts[5].trim());

				//nomDivisioTerritorial= parts[10].trim();
			} catch (Exception e) {

				nomDivisioTerritorial = 0;
			}

			neighborhoods.add(neighborhood);

			line = br.readLine();
		}

		br.close();
		fr.close();

		return neighborhoods;

	}
	
	@Override
	public void save(MultipartFile file) throws Exception {

		Files.copy(file.getInputStream(), this.rootFolder.resolve(file.getOriginalFilename()));
	}

	@Override
	public List<Neighborhood> findById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void saveOrUpdate(Neighborhood neighborhood) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteById(int id) {
		// TODO Auto-generated method stub

	}

}
