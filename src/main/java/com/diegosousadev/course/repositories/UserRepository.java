package com.diegosousadev.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.diegosousadev.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
}
