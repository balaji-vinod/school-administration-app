package com.school.administration.repository.user;

import org.springframework.data.jpa.repository.JpaRepository;

import com.school.administration.model.User;

public interface UserRepository extends JpaRepository<User, Long>{

	User findByUserName(String userName);
}
