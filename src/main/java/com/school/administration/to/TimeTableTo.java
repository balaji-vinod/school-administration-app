package com.school.administration.to;

import java.time.DayOfWeek;
import java.time.LocalTime;

import com.school.administration.model.ClassRoom;
import com.school.administration.model.Period;

public class TimeTableTo {
	
	private Long timeTableId;
	private String timeTableName;
	private DayOfWeek dayOfWeek;
	private ClassRoom classRoom;
	private Period period;
	
	
	public TimeTableTo() {
		super();
	}
	public TimeTableTo(Long timeTableId, String timeTableName, DayOfWeek dayOfWeek, Long classRoomId, String standard, String section, Long periodId, String periodName, LocalTime startTime, LocalTime endTime) {
		super();
		this.timeTableId = timeTableId;
		this.timeTableName = timeTableName;
		this.dayOfWeek = dayOfWeek;
		this.classRoom = new ClassRoom(classRoomId, null, standard, section, null, null);
		this.period = new Period(periodId, periodName, startTime, endTime, null, null, null);
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
