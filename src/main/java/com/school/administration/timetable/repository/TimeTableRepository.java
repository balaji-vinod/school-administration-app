package com.school.administration.timetable.repository;

import java.time.DayOfWeek;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.school.administration.model.Period;
import com.school.administration.to.TimeTableTo;

public interface TimeTableRepository extends JpaRepository<Period, Long> {
	
	@Query("select "
			+ "new com.school.administration.to.TimeTableTo("
							+ "t.timeTableId, "
							+ "t.timeTableName, "
							+ "t.dayOfWeek, "
							+ "c.classRoomId, "
							+ "c.standard, "
							+ "c.section, "
							+ "p.periodId, "
							+ "p.periodName, "
							+ "p.startTime, "
							+ "p.endTime) "
			+ "from "
				+ "TimeTable t, "
				+ "ClassRoom c, "
				+ "Period p "
			+ "where "
				+ "t.timeTableId=p.timeTable.timeTableId "
				+ "and t.classRoom.classRoomId = c.classRoomId "
				+ "and p.teacher.teacherId=:teacherId "
				+ "and t.dayOfWeek=:dayOfWeek "
			+ "order by "
				+ "p.startTime")
	public List<TimeTableTo> find(@Param("teacherId") long teacherId, @Param("dayOfWeek") DayOfWeek dayOfWeek);

}
