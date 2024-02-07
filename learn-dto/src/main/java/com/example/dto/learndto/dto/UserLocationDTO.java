package com.example.dto.learndto.dto;

import lombok.Data;

@Data
public class UserLocationDTO {
	private long userId;
	private String email;
	private String place;
	private long locationId;
	private double longitude;

}
