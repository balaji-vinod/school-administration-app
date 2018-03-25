package com.school.administration.repository.student;

import org.springframework.data.jpa.repository.JpaRepository;

import com.school.administration.model.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {

}
