package com.school.administration.model;

import java.time.LocalTime;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Period {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long periodId;
	
	private String periodName;
	private LocalTime startTime;
	private LocalTime endTime;
	
	@ManyToOne(cascade=CascadeType.ALL, fetch=FetchType.LAZY)
	@JoinColumn(name="time_table_id")
	@JsonIgnore
	private TimeTable timeTable;
	@ManyToOne(cascade=CascadeType.ALL, fetch=FetchType.LAZY)
	@JoinColumn(name="subject_id")
	@JsonIgnore
	private Subject subject;
	@ManyToOne(cascade=CascadeType.ALL, fetch=FetchType.LAZY)
	@JoinColumn(name="teacher_id")
	@JsonIgnore
	private Teacher teacher;

	public Period() {
		super();
	}
	
	public Period(Long periodId, String periodName, LocalTime startTime, LocalTime endTime, TimeTable timeTable,
			Subject subject, Teacher teacher) {
		super();
		this.periodId = periodId;
		this.periodName = periodName;
		this.startTime = startTime;
		this.endTime = endTime;
		this.timeTable = timeTable;
		this.subject = subject;
		this.teacher = teacher;
	}
	
	public Long getPeriodId() {
		return periodId;
	}
	public void setPeriodId(Long periodId) {
		this.periodId = periodId;
	}
	public String getPeriodName() {
		return periodName;
	}
	public void setPeriodName(String periodName) {
		this.periodName = periodName;
	}
	public LocalTime getStartTime() {
		return startTime;
	}
	public void setStartTime(LocalTime startTime) {
		this.startTime = startTime;
	}
	public LocalTime getEndTime() {
		return endTime;
	}
	public void setEndTime(LocalTime endTime) {
		this.endTime = endTime;
	}
	public TimeTable getTimeTable() {
		return timeTable;
	}
	public void setTimeTable(TimeTable timeTable) {
		this.timeTable = timeTable;
	}
	public Subject getSubject() {
		return subject;
	}
	public void setSubject(Subject subject) {
		this.subject = subject;
	}

	public Teacher getTeacher() {
		return teacher;
	}

	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}
}
