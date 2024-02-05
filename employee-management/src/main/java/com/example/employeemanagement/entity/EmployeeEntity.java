package com.example.employeemanagement.entity;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "mt_employee")
@Getter
@Setter
@AllArgsConstructor
public class EmployeeEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "emp_id")
	private Long id;

	@Column(name = "name")
	private String name;

	@Column(name = "gender")
	private String gender;

	@Column(name = "date_of_birth")
	private Date dateOfBirth;

	@Column(name = "address")
	private String address;

	public EmployeeEntity() {
	}

}