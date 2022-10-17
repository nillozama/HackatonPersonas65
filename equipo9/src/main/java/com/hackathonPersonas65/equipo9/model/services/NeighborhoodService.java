package com.hackathonPersonas65.equipo9.model.services;

import java.util.List;

import com.hackathonPersonas65.equipo9.model.domain.Neighborhood;


public interface NeighborhoodService {
	
	public List <Neighborhood> getAllNeighborhoods();
	public List<Neighborhood> findById(int id);
	public void saveOrUpdate(Neighborhood neighborhood);
	public void deleteById(int id);

}
