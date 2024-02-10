package com.example.studyhubapi.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.studyhubapi.entity.User;
import com.example.studyhubapi.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;

	public List<User> getAllUsers() {
		return userRepository.findAll();
	}

	public Optional<User> getUserById(Long userId) {
		return userRepository.findById(userId);
	}

	public User createUser(User user) {
		return userRepository.save(user);
	}

	public User updateUser(Long userId, User newUser) {
		return userRepository.findById(userId).map(existingUser -> {
			existingUser.setFirstName(newUser.getFirstName());
			existingUser.setLastName(newUser.getLastName());
			existingUser.setEmailId(newUser.getEmailId());
			existingUser.setPassword(newUser.getPassword());
			return userRepository.save(existingUser);
		}).orElse(null);
	}

	public boolean deleteUser(Long userId) {
		if (userRepository.existsById(userId)) {
			userRepository.deleteById(userId);
			return true;
		}
		return false;
	}
}
