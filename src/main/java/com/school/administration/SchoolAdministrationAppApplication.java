package com.school.administration;

import java.time.DayOfWeek;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.school.administration.model.ClassRoom;
import com.school.administration.model.Period;
import com.school.administration.model.SchoolBranch;
import com.school.administration.model.Student;
import com.school.administration.model.Subject;
import com.school.administration.model.Teacher;
import com.school.administration.model.TimeTable;
import com.school.administration.service.branch.SchoolBranchService;

@SpringBootApplication
public class SchoolAdministrationAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(SchoolAdministrationAppApplication.class, args);
	}
	
	@Bean
	CommandLineRunner runner(SchoolBranchService schoolBranchService) {
		return args -> {
			schoolBranchService.saveBranch(new SchoolBranch(null, "branchName", "branchLocation", createClassrooms()));
		};
	}

	private List<ClassRoom> createClassrooms() {
		List<ClassRoom> classRooms = new ArrayList<>();
		classRooms.add(new ClassRoom(null, null, "LKG", "A", createStudents(1), createTimetable(1)));
		classRooms.add(new ClassRoom(null, null, "LKG", "A", createStudents(2), createTimetable(2)));
		return classRooms;
	}

	private List<TimeTable> createTimetable(int i) {
		 List<TimeTable> timeTables = new ArrayList<>();
		 timeTables.add(new TimeTable(null, "timeTableName"+i, DayOfWeek.MONDAY, null, createPeriod(i)));
		 timeTables.add(new TimeTable(null, "timeTableName"+i, DayOfWeek.TUESDAY, null, createPeriod(i)));
		return timeTables;
	}

	private List<Period> createPeriod(int i) {
		List<Period> periods = new ArrayList<>();
		Teacher teacher = new Teacher(null, "TeacherName"+i, null);
		periods.add(new Period(null, "English"+i, LocalTime.of(9, 0), LocalTime.of(10, 0), null, createSubject(teacher), teacher));
		periods.add(new Period(null, "Tamil"+i, LocalTime.of(10, 5), LocalTime.of(11, 0), null, createSubject(teacher), teacher));
		teacher = new Teacher(null, "TeacherName1"+i, null);
		periods.add(new Period(null, "English1"+i, LocalTime.of(9, 0), LocalTime.of(10, 0), null, createSubject(teacher), teacher));
		periods.add(new Period(null, "Tamil1"+i, LocalTime.of(10, 5), LocalTime.of(11, 0), null, createSubject(teacher), teacher));
		return periods;
	}

	private Subject createSubject(Teacher teacher) {
		return new Subject(null,"subjectName", teacher, null);
	}

	private List<Student> createStudents(int i) {
		List<Student> students = new ArrayList<>();
		students.add(new Student(null,"rollNo","studentName",null));
		return null;
	}
}
