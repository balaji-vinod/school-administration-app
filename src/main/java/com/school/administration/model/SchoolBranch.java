package com.school.administration.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class SchoolBranch {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long branchId;
	private String branchName;
	private String branchLocation;
	
	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="branch_id")
	@JsonIgnore
	private List<ClassRoom> classRooms;

	public SchoolBranch() {
		super();
	}

	public SchoolBranch(Long branchId, String branchName, String branchLocation, List<ClassRoom> classRooms) {
		super();
		this.branchId = branchId;
		this.branchName = branchName;
		this.branchLocation = branchLocation;
		this.classRooms = classRooms;
	}

	public Long getBranchId() {
		return branchId;
	}

	public void setBranchId(Long branchId) {
		this.branchId = branchId;
	}

	public String getBranchName() {
		return branchName;
	}

	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}

	public String getBranchLocation() {
		return branchLocation;
	}

	public void setBranchLocation(String branchLocation) {
		this.branchLocation = branchLocation;
	}

	public List<ClassRoom> getClassRooms() {
		return classRooms;
	}

	public void setClassRooms(List<ClassRoom> classRooms) {
		this.classRooms = classRooms;
	}

}
