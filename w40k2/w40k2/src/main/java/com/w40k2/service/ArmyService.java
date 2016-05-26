package com.w40k2.service;

import java.util.Collection;

import com.w40k2.dao.entity.Figurine;
import com.w40k2.dao.entity.Role;

public interface ArmyService {

	void createFigurine(Figurine figurine);
	
	Collection<Figurine> getAllFigurines();
	
	void updateFigurine(Figurine figurine);
	
	void deleteFigurine(Figurine figurine);
	
	void createRole(Role role);
	
	void deleteRole(Role role);
}
