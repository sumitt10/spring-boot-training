package com.example.employeemanagement.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.employeemanagement.dto.request.EmployeeRequest;
import com.example.employeemanagement.dto.response.EmployeeResponse;
import com.example.employeemanagement.entity.EmployeeEntity;
import com.example.employeemanagement.service.EmployeeService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping("/employee")
public class EmployeeController {

	private final EmployeeService employeeService;

	public EmployeeController(EmployeeService employeeService) {
		this.employeeService = employeeService;
	}

	@GetMapping
	public List<EmployeeEntity> findAllEmployee() {
		log.info("Fetching all employees");
		return employeeService.findAllEmployee();
	}

	@GetMapping("/{id}")
	public Optional<EmployeeEntity> findEmployeeById(@PathVariable("id") Long id) {
		log.info("Fetching employee by ID: {}", id);
		return employeeService.findById(id);
	}

	@PostMapping
	public EmployeeEntity saveEmployee(@RequestBody EmployeeEntity employeeEntity) {
		log.info("Saving employee: {}", employeeEntity);
		return employeeService.saveEmployee(employeeEntity);
	}

	@PutMapping
	public EmployeeEntity updateEmployee(@RequestBody EmployeeEntity employeeEntity) {
		log.info("Updating employee: {}", employeeEntity);
		return employeeService.updateEmployee(employeeEntity);
	}

	@DeleteMapping("/{id}")
	public void deleteEmployee(@PathVariable("id") Long id) {
		log.info("Deleting employee by ID: {}", id);
		employeeService.deleteEmployee(id);
	}

	@PostMapping("/res")
	public EmployeeResponse saveEmpResponse(@RequestBody EmployeeRequest employeeRequest) {
		log.info("Saving employee response: {}", employeeRequest);
		return employeeService.saveEmployee(employeeRequest);
	}

	@PutMapping("/res/{id}")
	public EmployeeResponse updateEmpResponse(@RequestBody EmployeeRequest employeeRequest,
			@PathVariable("id") Long id) {
		log.info("Updating employee response with ID {}: {}", id, employeeRequest);
		return employeeService.updateEmployee(employeeRequest, id);
	}
}
