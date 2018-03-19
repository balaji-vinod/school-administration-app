package com.school.administration.timetable.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.school.administration.model.Period;
import com.school.administration.to.TimeTableTo;

public interface TimeTableRepository extends JpaRepository<Period, Long> {
	
	@Query("select new com.school.administration.to.TimeTableTo(t) from TimeTable t, Period p where t.timeTableId=p.timeTable.timeTableId and p.teacher.teacherId=:teacherId")
	public List<TimeTableTo> find(@Param("teacherId") long teacherId);

}
