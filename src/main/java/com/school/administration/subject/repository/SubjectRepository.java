package com.school.administration.subject.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.school.administration.model.Subject;

public interface SubjectRepository extends JpaRepository<Subject, Long> {

}
