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
public class TimeTable {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long timeTableId;
	private String timeTableName;
	
	private Day day;
	
	@ManyToOne
	@JoinColumn(name="class_room_id")
	private ClassRoom classRoom;
	@OneToMany
	@JoinColumn(name="time_table_id")
	private List<Period> period;
	
	public TimeTable() {
		super();
	}
	
	public TimeTable(Long timeTableId, String timeTableName, Day day, ClassRoom classRoom, List<Period> period) {
		super();
		this.timeTableId = timeTableId;
		this.timeTableName = timeTableName;
		this.day = day;
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
	public Day getDay() {
		return day;
	}
	public void setDay(Day day) {
		this.day = day;
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

}
