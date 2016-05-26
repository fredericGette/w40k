package com.w40k2.dao;

import com.w40k2.dao.entity.Figurine;

public interface FigurineDao {

	void create(Figurine figurine);
	
	Figurine read(long figurineId);
	
	void update(Figurine figurine);
	
	void delete(Figurine figurine);
}
