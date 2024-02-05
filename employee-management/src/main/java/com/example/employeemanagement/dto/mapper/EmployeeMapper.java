package com.example.employeemanagement.dto.mapper;

import org.mapstruct.Mapper;

import com.example.employeemanagement.dto.request.EmployeeRequest;
import com.example.employeemanagement.dto.response.EmployeeResponse;
import com.example.employeemanagement.entity.EmployeeEntity;

@Mapper
public interface EmployeeMapper {

	String Mappers = null;
	EmployeeMapper MAPPER = Mappers.getMapper(EmployeeMapper.class);

	EmployeeEntity fromRequestToEntity(EmployeeRequest employeeRequest);

	EmployeeResponse fromEntityToResponse(EmployeeEntity employeeEntity);
}
