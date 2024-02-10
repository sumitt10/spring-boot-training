package com.example.studyhubapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.studyhubapi.entity.Course;
import com.example.studyhubapi.repository.CourseRepository;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping("/studyhub/courses")
public class CourseController {

	@Autowired
	private CourseRepository courseRepository;

	@GetMapping
	public List<Course> getAllCourses() {
		return courseRepository.findAll();
	}

	@GetMapping("/{courseId}")
	public Course getCourseById(@PathVariable Long courseId) {
		return courseRepository.findById(courseId).orElse(null);
	}

	@PostMapping
	public Course createCourse(@RequestBody Course course) {
		log.info("Course Added !!");
		return courseRepository.save(course);
	}

}
