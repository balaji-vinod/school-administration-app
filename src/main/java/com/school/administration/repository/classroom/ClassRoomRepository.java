package com.school.administration.repository.classroom;

import org.springframework.data.jpa.repository.JpaRepository;

import com.school.administration.model.ClassRoom;

public interface ClassRoomRepository extends JpaRepository<ClassRoom, Long> {

}
