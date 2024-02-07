package com.example.dto.learndto.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.dto.learndto.dto.UserLocationDTO;
import com.example.dto.learndto.service.UserService;

@RestController
public class UserController {
	@Autowired
	private UserService userService;

	@GetMapping("/user-details")
	public List<UserLocationDTO> getAllUsersLocation() {
		return userService.getAllUsersLocation();
	}

	@PostMapping("/create-user")
	public ResponseEntity<UserLocationDTO> createUser(@RequestBody UserLocationDTO userLocationDTO) {
		UserLocationDTO createdUser = userService.createUser(userLocationDTO);
		return new ResponseEntity<>(createdUser, HttpStatus.CREATED);
	}
}
