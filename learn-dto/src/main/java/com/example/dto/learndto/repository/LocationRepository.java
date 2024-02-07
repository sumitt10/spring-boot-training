package com.example.dto.learndto.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.dto.learndto.entity.Location;

public interface LocationRepository extends JpaRepository<Location, Long> {

}
