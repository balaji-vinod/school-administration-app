package com.school.administration.timetable.dao;

import java.time.DayOfWeek;
import java.util.List;

import javax.persistence.Query;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.school.administration.dao.BaseDAO;
import com.school.administration.to.TimeTableTo;

@Repository
@Transactional
public class TimeTableDAO extends BaseDAO {

	
	@SuppressWarnings("unchecked")
	public List<TimeTableTo> getTimetableForTeacher(long teacherId, DayOfWeek dayOfWeek) {
		Query query = getEntityManager().createQuery("select new com.school.administration.to.TimeTableTo(t, t.classRoom, p) "
				+ "from TimeTable t, Period p "
				+ "where t.timeTableId=p.timeTable.timeTableId "
				+ "and p.teacher.teacherId=:teacherId "
				+ "and t.dayOfWeek=:dayOfWeek "
				+ "order by p.startTime");
		query.setParameter("teacherId", teacherId);
		query.setParameter("dayOfWeek", dayOfWeek);
		return query.getResultList();
	}
}
