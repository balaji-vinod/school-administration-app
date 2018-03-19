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
public class Teacher {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long teacherId;
	private String teacherName;
	
	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="teacher_id")
	@JsonIgnore
	private List<Subject> subject;
	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="teacher_id")
	@JsonIgnore
	private List<Period> period;

	public Teacher() {
		super();
	}

	public Teacher(Long teacherId, String teacherName, List<Subject> subject) {
		super();
		this.teacherId = teacherId;
		this.teacherName = teacherName;
		this.subject = subject;
	}

	public Long getTeacherId() {
		return teacherId;
	}

	public void setTeacherId(Long teacherId) {
		this.teacherId = teacherId;
	}

	public String getTeacherName() {
		return teacherName;
	}

	public void setTeacherName(String teacherName) {
		this.teacherName = teacherName;
	}

	public List<Subject> getSubject() {
		return subject;
	}

	public void setSubject(List<Subject> subject) {
		this.subject = subject;
	}

	public List<Period> getPeriod() {
		return period;
	}

	public void setPeriod(List<Period> period) {
		this.period = period;
	}

}
