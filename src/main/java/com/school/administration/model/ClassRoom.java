package com.school.administration.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class ClassRoom {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long classRoomId;
	
	
	private String standard;
	private String section;
	
	@OneToMany
	@JoinColumn(name="class_room_id")
	private List<Student> students;
	@OneToMany
	@JoinColumn(name="class_room_id")
	private List<TimeTable> timeTables;
	@ManyToOne
	@JoinColumn(name="branch_id")
	private SchoolBranch schoolBranch;
	public ClassRoom() {
		super();
	}
	
	public ClassRoom(Long classRoomId, SchoolBranch schoolBranch, String standard, String section,
			List<Student> students, List<TimeTable> timeTables) {
		super();
		this.classRoomId = classRoomId;
		this.schoolBranch = schoolBranch;
		this.standard = standard;
		this.section = section;
		this.students = students;
		this.timeTables = timeTables;
	}
	
	public Long getClassRoomId() {
		return classRoomId;
	}
	public void setClassRoomId(Long classRoomId) {
		this.classRoomId = classRoomId;
	}
	public SchoolBranch getSchoolBranch() {
		return schoolBranch;
	}
	public void setSchoolBranch(SchoolBranch schoolBranch) {
		this.schoolBranch = schoolBranch;
	}
	public String getStandard() {
		return standard;
	}
	public void setStandard(String standard) {
		this.standard = standard;
	}
	public String getSection() {
		return section;
	}
	public void setSection(String section) {
		this.section = section;
	}
	public List<Student> getStudents() {
		return students;
	}
	public void setStudents(List<Student> students) {
		this.students = students;
	}
	public List<TimeTable> getTimeTables() {
		return timeTables;
	}
	public void setTimeTables(List<TimeTable> timeTables) {
		this.timeTables = timeTables;
	}
}
