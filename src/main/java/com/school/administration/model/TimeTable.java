package com.school.administration.model;

import java.time.DayOfWeek;
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
public class TimeTable {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long timeTableId;
	private String timeTableName;
	
	private DayOfWeek dayOfWeek;
	
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="class_room_id")
	@JsonIgnore
	private ClassRoom classRoom;
	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="time_table_id")
	@JsonIgnore
	private List<Period> period;
	
	public TimeTable() {
		super();
	}
	
	public TimeTable(Long timeTableId, String timeTableName, DayOfWeek dayOfWeek, ClassRoom classRoom, List<Period> period) {
		super();
		this.timeTableId = timeTableId;
		this.timeTableName = timeTableName;
		this.dayOfWeek = dayOfWeek;
		this.classRoom = classRoom;
		this.period = period;
	}
	
	public Long getTimeTableId() {
		return timeTableId;
	}
	public void setTimeTableId(Long timeTableId) {
		this.timeTableId = timeTableId;
	}
	public String getTimeTableName() {
		return timeTableName;
	}
	public void setTimeTableName(String timeTableName) {
		this.timeTableName = timeTableName;
	}
	
	public ClassRoom getClassRoom() {
		return classRoom;
	}
	public void setClassRoom(ClassRoom classRoom) {
		this.classRoom = classRoom;
	}
	public List<Period> getPeriod() {
		return period;
	}
	public void setPeriod(List<Period> period) {
		this.period = period;
	}

	public DayOfWeek getDayOfWeek() {
		return dayOfWeek;
	}

	public void setDayOfWeek(DayOfWeek dayOfWeek) {
		this.dayOfWeek = dayOfWeek;
	}

}
