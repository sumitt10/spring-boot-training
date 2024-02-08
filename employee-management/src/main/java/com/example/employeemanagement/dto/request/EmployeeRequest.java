package com.example.employeemanagement.dto.request;

import java.util.Date;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class EmployeeRequest {
	private Long id;
	private String name;
	private String gender;
	private Date dateOfBirth;
	private String Address;

}
