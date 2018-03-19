package com.school.administration.timetable.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.school.administration.timetable.service.TimeTableService;
import com.school.administration.to.TimeTableTo;

@RestController
@RequestMapping("/api/timetable")
public class TImeTableController {
	
	@Autowired
	private TimeTableService timeTableService;
	
	@GetMapping("/teacher/{teacherId}")
	public List<TimeTableTo> getTimeSheetForTeacher(@PathVariable("teacherId") Long teacherId) {
		return timeTableService.getTimeTableForTeacher(teacherId);
	}

}
