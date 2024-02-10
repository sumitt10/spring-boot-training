package com.example.studyhubapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.studyhubapi.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
