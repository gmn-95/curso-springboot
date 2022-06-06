package com.gustavoweb.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gustavoweb.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{
	
}
