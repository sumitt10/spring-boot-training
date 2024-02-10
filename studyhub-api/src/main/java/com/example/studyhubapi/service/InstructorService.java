package com.example.studyhubapi.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.studyhubapi.entity.Instructor;
import com.example.studyhubapi.repository.InstructorRepository;

@Service
public class InstructorService {

	@Autowired
	private InstructorRepository instructorRepository;

	public List<Instructor> getAllInstructors() {
		return instructorRepository.findAll();
	}

	public Optional<Instructor> getInstructorById(Long instructorId) {
		return instructorRepository.findById(instructorId);
	}

	public Instructor createInstructor(Instructor instructor) {
		return instructorRepository.save(instructor);
	}

	public boolean deleteInstructor(Long instructorId) {
		if (instructorRepository.existsById(instructorId)) {
			instructorRepository.deleteById(instructorId);
			return true;
		}
		return false;
	}
}
