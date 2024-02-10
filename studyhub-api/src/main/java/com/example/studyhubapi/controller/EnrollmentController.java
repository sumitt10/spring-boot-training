package com.example.studyhubapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.studyhubapi.entity.Enrollment;
import com.example.studyhubapi.repository.EnrollmentRepository;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping("/studyhub/enrollments")
public class EnrollmentController {

	@Autowired
	private EnrollmentRepository enrollmentRepository;

	@GetMapping
	public List<Enrollment> getAllEnrollments() {
		return enrollmentRepository.findAll();
	}

	@GetMapping("/{enrollId}")
	public Enrollment getEnrollmentById(@PathVariable Long enrollId) {
		return enrollmentRepository.findById(enrollId).orElse(null);
	}

	@PostMapping
	public Enrollment createEnrollment(@RequestBody Enrollment enrollment) {
		log.info("Enroll Successfully !!");
		return enrollmentRepository.save(enrollment);
	}

}
