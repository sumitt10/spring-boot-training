package com.example.dto.learndto.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.dto.learndto.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
