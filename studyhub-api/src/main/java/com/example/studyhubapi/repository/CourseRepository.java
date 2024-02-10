package com.example.studyhubapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.studyhubapi.entity.Course;

@Repository
public interface CourseRepository extends JpaRepository<Course, Long> {
}
