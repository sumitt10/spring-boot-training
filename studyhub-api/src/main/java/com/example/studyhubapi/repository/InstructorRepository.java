package com.example.studyhubapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.studyhubapi.entity.Instructor;

@Repository
public interface InstructorRepository extends JpaRepository<Instructor, Long> {
}
