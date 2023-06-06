package com.couresmanagment.controller.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.couresmanagment.controller.entities.Course;

public interface Coursedao extends JpaRepository<Course, Long> {
	

}
