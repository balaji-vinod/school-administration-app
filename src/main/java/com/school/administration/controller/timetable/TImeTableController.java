package com.school.administration.controller.timetable;

import java.time.DayOfWeek;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.school.administration.service.timetable.TimeTableService;
import com.school.administration.to.TimeTableTo;

@RestController
@RequestMapping("/api/timetable")
public class TImeTableController {
	
	@Autowired
	private TimeTableService timeTableService;
	
	@GetMapping("/teacher/{teacherId}/{dateOfWeek}")
	public List<TimeTableTo> getTimeSheetForTeacher(@PathVariable("teacherId") Long teacherId, @PathVariable("dateOfWeek") Integer dateOfWeek) {
		return timeTableService.getTimeTableForTeacher(teacherId, DayOfWeek.of(dateOfWeek));
	}

}
