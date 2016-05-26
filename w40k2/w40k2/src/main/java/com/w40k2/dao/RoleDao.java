package com.w40k2.dao;

import com.w40k2.dao.entity.Role;

public interface RoleDao {

	void create(Role role);
	
	Role read(String roleId);
	
	void update(Role role);
	
	void delete(Role role);
	
}
