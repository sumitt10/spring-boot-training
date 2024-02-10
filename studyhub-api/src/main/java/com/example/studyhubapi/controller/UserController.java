package com.example.studyhubapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.studyhubapi.entity.User;
import com.example.studyhubapi.repository.UserRepository;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping("/studyhub/users")
public class UserController {

	@Autowired
	private UserRepository userRepository;

	@GetMapping
	public List<User> getAllUsers() {
		return userRepository.findAll();
	}

	@GetMapping("/{userId}")
	public User getUserById(@PathVariable Long userId) {
		return userRepository.findById(userId).orElse(null);
	}

	@PostMapping
	public User createUser(@RequestBody User user) {
		log.info("User Created !!");
		return userRepository.save(user);
	}

}
