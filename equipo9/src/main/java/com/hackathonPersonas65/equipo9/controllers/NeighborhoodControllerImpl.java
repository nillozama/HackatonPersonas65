package com.hackathonPersonas65.equipo9.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.hackathonPersonas65.equipo9.model.domain.Neighborhood;
import com.hackathonPersonas65.equipo9.model.services.NeighborhoodServiceImpl;


@RestController
@RequestMapping("/barri")
public class NeighborhoodControllerImpl {
	
	@Autowired
	private NeighborhoodServiceImpl neighborhoodServiceImpl;

	@CrossOrigin(origins="http://localhost:8080")
	@GetMapping("/convert/{csvFile}")
	@ResponseBody
	public ResponseEntity<List<Neighborhood>> getAllProducts(@PathVariable("csvFile") String file) {

		ResponseEntity<List<Neighborhood>> responseEntity;

		try {
			List<Neighborhood> products = new ArrayList<Neighborhood>();
			products = neighborhoodServiceImpl.getAllNeighborhoods(file);

			if (products.isEmpty()) {

				responseEntity = new ResponseEntity<>(HttpStatus.NO_CONTENT);
			}

			responseEntity = new ResponseEntity<List<Neighborhood>>(products, HttpStatus.OK);

		} catch (Exception e) {

			responseEntity = new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}

		return responseEntity;
	}
	
	@PostMapping("/upload")
	public ResponseEntity<String> uploadFiles(@RequestParam("file") MultipartFile file) {

		ResponseEntity<String> responseEntity;
		try {
			
			neighborhoodServiceImpl.save(file);
			
			responseEntity=ResponseEntity.status(HttpStatus.OK).body("Archivo cargado correctamente");
			

		} catch (Exception e) {
			responseEntity= ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Error al subir el archive");
		}
		return responseEntity;
	}

}
