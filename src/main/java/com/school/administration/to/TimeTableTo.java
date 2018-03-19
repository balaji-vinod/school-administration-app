package com.school.administration.to;

import java.util.List;

import com.school.administration.model.ClassRoom;
import com.school.administration.model.Day;
import com.school.administration.model.Period;
import com.school.administration.model.TimeTable;

public class TimeTableTo {
	
	private Long timeTableId;
	private String timeTableName;
	private Day day;
	private ClassRoom classRoom;
	private List<Period> period;
	
	
	public TimeTableTo() {
		super();
	}
	public TimeTableTo(TimeTable timeTable) {
		super();
		this.timeTableId = timeTable.getTimeTableId();
		this.timeTableName = timeTable.getTimeTableName();
		this.day = timeTable.getDay();
		this.classRoom = timeTable.getClassRoom();
		this.period = timeTable.getPeriod();
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
