package com.example.employeemanagement.service;

import java.util.List;
import java.util.Optional;

import com.example.employeemanagement.dto.request.EmployeeRequest;
import com.example.employeemanagement.dto.response.EmployeeResponse;
import com.example.employeemanagement.entity.EmployeeEntity;

public interface EmployeeService {
	List<EmployeeEntity> findAllEmployee();

	Optional<EmployeeEntity> findById(Long id);

	EmployeeEntity saveEmployee(EmployeeEntity employeeEntity);

	EmployeeEntity updateEmployee(EmployeeEntity employeeEntity);

	void deleteEmployee(Long id);

	EmployeeResponse saveEmployee(EmployeeRequest employeeRequest);

	EmployeeResponse updateEmployee(EmployeeRequest employeeRequest, Long id);

}
