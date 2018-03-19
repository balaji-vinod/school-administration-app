package com.school.administration.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Student {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long studentId;
	private String rollNo;
	private String studentName;
	
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="class_roon_id")
	@JsonIgnore
	private ClassRoom classRoom;

	public Student() {
		super();
	}

	public Student(Long studentId, String rollNo, String studentName, ClassRoom classRoom) {
		super();
		this.studentId = studentId;
		this.rollNo = rollNo;
		this.studentName = studentName;
		this.classRoom = classRoom;
	}

	public Long getStudentId() {
		return studentId;
	}

	public void setStudentId(Long studentId) {
		this.studentId = studentId;
	}

	public String getRollNo() {
		return rollNo;
	}

	public void setRollNo(String rollNo) {
		this.rollNo = rollNo;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public ClassRoom getClassRoom() {
		return classRoom;
	}

	public void setClassRoom(ClassRoom classRoom) {
		this.classRoom = classRoom;
	}

}
