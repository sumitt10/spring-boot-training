package com.example.employeemanagement.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.employeemanagement.dto.mapper.EmployeeMapper;
import com.example.employeemanagement.dto.request.EmployeeRequest;
import com.example.employeemanagement.dto.response.EmployeeResponse;
import com.example.employeemanagement.entity.EmployeeEntity;
import com.example.employeemanagement.repository.EmployeeRepository;
import com.example.employeemanagement.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	private final EmployeeRepository employeeRepository;
	private EmployeeMapper employeeMapper;

	public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
		this.employeeRepository = employeeRepository;

	}

	@Override
	public List<EmployeeEntity> findAllEmployee() {
		return employeeRepository.findAll();
	}

	@Override
	public Optional<EmployeeEntity> findById(Long id) {
		return employeeRepository.findById(id);
	}

	@Override
	public EmployeeEntity saveEmployee(EmployeeEntity employeeEntity) {
		return employeeRepository.save(employeeEntity);
	}

	@Override
	public EmployeeEntity updateEmployee(EmployeeEntity employeeEntity) {
		return employeeRepository.save(employeeEntity);
	}

	@Override
	public void deleteEmployee(Long id) {
		employeeRepository.deleteById(id);
	}

	@Override
	public EmployeeResponse saveEmployee(EmployeeRequest employeeRequest) {
		EmployeeEntity employeeEntity = employeeMapper.fromRequestToEntity(employeeRequest);
		employeeRepository.save(employeeEntity);
		return employeeMapper.fromEntityToResponse(employeeEntity);
	}

	@Override
	public EmployeeResponse updateEmployee(EmployeeRequest employeeRequest, Long id) {
		Optional<EmployeeEntity> checkExistingEmployee = findById(id);
		if (!checkExistingEmployee.isPresent())
			throw new RuntimeException("Employee Id " + id + " Not Found!");

		EmployeeEntity employeeEntity = employeeMapper.fromRequestToEntity(employeeRequest);
		employeeEntity.setId(id);
		employeeRepository.save(employeeEntity);
		return employeeMapper.fromEntityToResponse(employeeEntity);
	}

}
