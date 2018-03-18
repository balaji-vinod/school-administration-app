package com.school.administration.timetable.dao;

import javax.persistence.Query;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.school.administration.dao.BaseDAO;

@Repository
@Transactional
public class TimeTableDAO extends BaseDAO {

	public void getTimetableForTeacher() {
		Query query = getEntityManager().createQuery("");
		query.getResultList();
	}
}
