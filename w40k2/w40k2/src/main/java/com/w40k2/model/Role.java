package com.w40k2.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table( name = "role" )
public class Role {

	@Id
	@Column(name = "id")
	private String id;

	public Role() {
		super();
	}

	public Role(String id) {
		this();
		this.id = id;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	
	
	
}
