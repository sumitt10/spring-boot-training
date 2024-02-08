package com.example.dto.learndto.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dto.learndto.dto.UserLocationDTO;
import com.example.dto.learndto.entity.Location;
import com.example.dto.learndto.entity.User;
import com.example.dto.learndto.repository.UserRepository;

@Service
public class UserService {
	@Autowired
	private UserRepository userRepository;

	public List<UserLocationDTO> getAllUsersLocation() {
		return userRepository.findAll().stream().map(this::convertEntityToDto).collect(Collectors.toList());
	}

	public UserLocationDTO createUser(UserLocationDTO userLocationDTO) {
		User user = convertEntityToDto(userLocationDTO);
		User savedUser = userRepository.save(user);
		return convertEntityToDto(savedUser);
	}

	private UserLocationDTO convertEntityToDto(User user) {
		UserLocationDTO userLocationDTO = new UserLocationDTO();
		userLocationDTO.setUserId(user.getId());
		userLocationDTO.setEmail(user.getEmail());
		userLocationDTO.setPlace(user.getLocation().getPlace());
		userLocationDTO.setLongitude(user.getLocation().getLongitude());
		return userLocationDTO;

	}

	private User convertEntityToDto(UserLocationDTO userLocationDTO) {
		User user = new User();
		user.setId(userLocationDTO.getUserId());
		user.setEmail(userLocationDTO.getEmail());
		Location location = new Location();
		location.setPlace(userLocationDTO.getPlace());
		location.setLongitude(userLocationDTO.getLongitude());

		user.setLocation(location);
		return user;
	}
}
