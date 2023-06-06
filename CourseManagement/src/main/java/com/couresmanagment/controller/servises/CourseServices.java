package com.couresmanagment.controller.servises;

import java.util.List;

import com.couresmanagment.controller.entities.Course;

public interface CourseServices {
	public List<Course> getCourses();

	public Course getCourse(long courseId);

	public Course addCourse(Course course);

	public Course updateCourse(Course course);
	
	public void deleteCourse(long parseLong);

}
