package com.couresmanagment.controller.servises;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.couresmanagment.controller.dao.Coursedao;
import com.couresmanagment.controller.entities.Course;

@Service
public class CourseServiceImpl implements CourseServices {

	@Autowired
	private Coursedao coursedao;

//	List<Course> list;

	public CourseServiceImpl() {
//		list = new ArrayList<>();
//		list.add(new Course(145, "Core Java", "this course contains basic of java"));
//		list.add(new Course(146, "Advance Java", "this course contain advanve knowledg of Java"));
//	

	}

	@Override
	public List<Course> getCourses() {
		return coursedao.findAll();
	}

	@Override
	public Course getCourse(long courseId) {
//		Course c = null;
//		for (Course course : list) {
//			if (course.getId() == courseId) {
//				c = course;
//				break;
//			}
//
//		}
		return coursedao.getOne(courseId);
	}

	@Override
	public Course addCourse(Course course) {
//		list.add(course);
		coursedao.save(course);
		return course;
	}

	@Override
	public Course updateCourse(Course course) {
//		list.forEach(e -> { 
//			if(e.getId()== course.getId()) {
//				e.setTitle(course.getTitle());
//				e.setDecscription(course.getDecscription());
//			}
//		});
		coursedao.save(course);
		return course;
	}

	@Override
	public void deleteCourse(long parseLong) {
//		list=this.list.stream().filter(e -> e.getId()!=parseLong).collect(Collectors.toList());
		Course entity = coursedao.getOne(parseLong);
		coursedao.delete(entity);
	}

}
