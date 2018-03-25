package com.school.administration.teacher.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.school.administration.model.Teacher;

public interface TeacherRepository extends JpaRepository<Teacher, Long> {

}
