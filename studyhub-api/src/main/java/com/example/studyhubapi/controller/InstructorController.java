package com.example.studyhubapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.studyhubapi.entity.Instructor;
import com.example.studyhubapi.repository.InstructorRepository;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping("/studyhub/instructors")
public class InstructorController {

	@Autowired
	private InstructorRepository instructorRepository;

	@GetMapping
	public List<Instructor> getAllInstructors() {
		return instructorRepository.findAll();
	}

	@GetMapping("/{instructorId}")
	public Instructor getInstructorById(@PathVariable Long instructorId) {
		return instructorRepository.findById(instructorId).orElse(null);
	}

	@PostMapping
	public Instructor createInstructor(@RequestBody Instructor instructor) {
		log.info("Instructor created !! ");
		return instructorRepository.save(instructor);
	}

}
