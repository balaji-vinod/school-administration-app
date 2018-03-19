package com.school.administration.timetable.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.school.administration.timetable.repository.TimeTableRepository;
import com.school.administration.to.TimeTableTo;

@Service
public class TimeTableService {
	
	@Autowired
	private TimeTableRepository TimeTableRepository;
	
	public List<TimeTableTo> getTimeTableForTeacher(Long teacherId) {
		return TimeTableRepository.find(teacherId);
	}

}
