package com.example.studyhubapi.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.studyhubapi.entity.Course;
import com.example.studyhubapi.repository.CourseRepository;

@Service
public class CourseService {

	@Autowired
	private CourseRepository courseRepository;

	public List<Course> getAllCourses() {
		return courseRepository.findAll();
	}

	public Optional<Course> getCourseById(Long courseId) {
		return courseRepository.findById(courseId);
	}

	public Course createCourse(Course course) {
		return courseRepository.save(course);
	}

	public Course updateCourse(Long courseId, Course newCourse) {
		return courseRepository.findById(courseId).map(existingCourse -> {
			existingCourse.setTitleName(newCourse.getTitleName());
			existingCourse.setDescription(newCourse.getDescription());
			existingCourse.setPrice(newCourse.getPrice());
			return courseRepository.save(existingCourse);
		}).orElse(null);
	}

	public boolean deleteCourse(Long courseId) {
		if (courseRepository.existsById(courseId)) {
			courseRepository.deleteById(courseId);
			return true;
		}
		return false;
	}
}
