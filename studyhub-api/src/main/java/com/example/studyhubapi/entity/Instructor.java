package com.example.studyhubapi.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "instructor_details")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Instructor {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long instructorId;

	private String firstName;
	private String lastName;
	private String emailId;
	private String bioInfo;

}
