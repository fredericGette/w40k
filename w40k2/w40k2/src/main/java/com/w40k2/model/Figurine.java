package com.w40k2.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table( name = "figurine" )
public class Figurine {

	@Id
	@Column(name = "id")
	private int id;
	
	@Column(name = "default_role")
	private Role default_role;
	
	@Column(name = "role")
	private Role role;

	public Figurine() {
		super();
	}

	public int getId() {
		return id;
	}

	public Role getDefault_role() {
		return default_role;
	}

	public Role getRole() {
		return role;
	}

	
	public void setId(int id) {
		this.id = id;
	}

	public void setDefault_role(Role default_role) {
		this.default_role = default_role;
	}
	
	public void setRole(Role role) {
		this.role = role;
	}
	
	
	
}
