package com.w40k2.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table( name = "figurine" )
public class Figurine {

	@Id
	@SequenceGenerator(name="figurine_pk_sequence",sequenceName="figurine_id_seq",allocationSize=1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="figurine_pk_sequence")
	@Column(name = "id")
	private long id;
	
	@ManyToOne
	@JoinColumn(name = "default_role")
	private Role default_role;
	
	@ManyToOne
	@JoinColumn(name = "role")
	private Role role;
	
	@ManyToMany
	@JoinTable(
		name="figurine_roles",
		joinColumns=@JoinColumn(name="figurine_id", referencedColumnName="id"),
	    inverseJoinColumns=@JoinColumn(name="role_id", referencedColumnName="id")
	)
	private Set<Role> possibleRoles;

	public Figurine() {
		super();
	}

	public long getId() {
		return id;
	}

	public Role getDefault_role() {
		return default_role;
	}

	public Role getRole() {
		return role;
	}

	
	public void setId(long id) {
		this.id = id;
	}

	public void setDefault_role(Role default_role) {
		this.default_role = default_role;
	}
	
	public void setRole(Role role) {
		this.role = role;
	}

	public Set<Role> getPossibleRoles() {
		return possibleRoles;
	}

	public void setPossibleRoles(Set<Role> possibleRoles) {
		this.possibleRoles = possibleRoles;
	}
	
	public void addPossibleRole(Role role)  {
		if (this.possibleRoles == null) {
			this.possibleRoles = new HashSet<Role>();
		}
		this.possibleRoles.add(role);
	}
}
