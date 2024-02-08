package com.example.employeemanagement.dto.response;

import java.util.Date;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class EmployeeResponse {

	private Long id;
	private String name;
	private String gender;
	private Date dateOfBirth;
	private String address;

	public EmployeeResponse() {
	}

}