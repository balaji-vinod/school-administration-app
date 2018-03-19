package com.school.administration.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Subject {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long subjectId;
	private String subjectName;
	
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="teacher_id")
	@JsonIgnore
	private Teacher teacher;
	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="subject_id")
	@JsonIgnore
	private List<Period> periods;

	public Subject() {
		super();
	}

	public Subject(Long subjectId, String subjectName, Teacher teacher, List<Period> periods) {
		super();
		this.subjectId = subjectId;
		this.subjectName = subjectName;
		this.teacher = teacher;
		this.periods = periods;
	}

	public Long getSubjectId() {
		return subjectId;
	}

	public void setSubjectId(Long subjectId) {
		this.subjectId = subjectId;
	}

	public String getSubjectName() {
		return subjectName;
	}

	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}

	public Teacher getTeacher() {
		return teacher;
	}

	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}

	public List<Period> getPeriods() {
		return periods;
	}

	public void setPeriods(List<Period> periods) {
		this.periods = periods;
	}

}
