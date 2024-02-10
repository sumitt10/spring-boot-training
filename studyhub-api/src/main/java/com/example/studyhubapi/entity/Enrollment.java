package com.example.studyhubapi.entity;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "enrollment_details")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Enrollment {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long enrollId;

	@ManyToOne
	@JoinColumn(name = "user_id")
	private User users;

	@ManyToOne
	@JoinColumn(name = "course_id")
	private Course courses;

	private Date enrollDate;

}
