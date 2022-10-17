package com.hackathonPersonas65.equipo9.model.services;

import java.io.IOException;
import java.util.List;

import org.springframework.web.multipart.MultipartFile;

import com.hackathonPersonas65.equipo9.model.domain.Neighborhood;



public interface NeighborhoodService {
	
	public List <Neighborhood> getAllNeighborhoods(String csvFile) throws IOException;
	public List<Neighborhood> findById(int id);
	public void saveOrUpdate(Neighborhood neighborhood);
	public void deleteById(int id);	
	public void save(MultipartFile file) throws Exception;

}
