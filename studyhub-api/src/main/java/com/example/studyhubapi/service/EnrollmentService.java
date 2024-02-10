package com.example.studyhubapi.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.studyhubapi.entity.Enrollment;
import com.example.studyhubapi.repository.EnrollmentRepository;

@Service
public class EnrollmentService {

	@Autowired
	private EnrollmentRepository enrollmentRepository;

	public List<Enrollment> getAllEnrollments() {
		return enrollmentRepository.findAll();
	}

	public Optional<Enrollment> getEnrollmentById(Long enrollId) {
		return enrollmentRepository.findById(enrollId);
	}

	public Enrollment createEnrollment(Enrollment enrollment) {
		return enrollmentRepository.save(enrollment);
	}
}
