package com.school.administration.to;

import java.time.DayOfWeek;

import com.school.administration.model.ClassRoom;
import com.school.administration.model.Period;
import com.school.administration.model.TimeTable;

public class TimeTableTo {
	
	private Long timeTableId;
	private String timeTableName;
	private DayOfWeek dayOfWeek;
	private ClassRoom classRoom;
	private Period period;
	
	
	public TimeTableTo() {
		super();
	}
	public TimeTableTo(TimeTable timeTable, ClassRoom classRoom, Period period) {
		super();
		this.timeTableId = timeTable.getTimeTableId();
		this.timeTableName = timeTable.getTimeTableName();
		this.dayOfWeek = timeTable.getDayOfWeek();
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
	public Period getPeriod() {
		return period;
	}
	public void setPeriod(Period period) {
		this.period = period;
	}
	public DayOfWeek getDayOfWeek() {
		return dayOfWeek;
	}
	public void setDayOfWeek(DayOfWeek dayOfWeek) {
		this.dayOfWeek = dayOfWeek;
	}

}
