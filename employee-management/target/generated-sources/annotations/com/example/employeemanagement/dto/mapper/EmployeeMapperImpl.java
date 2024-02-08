package com.example.employeemanagement.dto.mapper;

import com.example.employeemanagement.dto.request.EmployeeRequest;
import com.example.employeemanagement.dto.response.EmployeeResponse;
import com.example.employeemanagement.entity.EmployeeEntity;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-02-08T17:42:41+0530",
    comments = "version: 1.5.5.Final, compiler: Eclipse JDT (IDE) 3.36.0.v20231114-0937, environment: Java 17.0.10 (Eclipse Adoptium)"
)
public class EmployeeMapperImpl implements EmployeeMapper {

    @Override
    public EmployeeEntity fromRequestToEntity(EmployeeRequest employeeRequest) {
        if ( employeeRequest == null ) {
            return null;
        }

        EmployeeEntity employeeEntity = new EmployeeEntity();

        employeeEntity.setAddress( employeeRequest.getAddress() );
        employeeEntity.setDateOfBirth( employeeRequest.getDateOfBirth() );
        employeeEntity.setGender( employeeRequest.getGender() );
        employeeEntity.setId( employeeRequest.getId() );
        employeeEntity.setName( employeeRequest.getName() );

        return employeeEntity;
    }

    @Override
    public EmployeeResponse fromEntityToResponse(EmployeeEntity employeeEntity) {
        if ( employeeEntity == null ) {
            return null;
        }

        EmployeeResponse employeeResponse = new EmployeeResponse();

        employeeResponse.setAddress( employeeEntity.getAddress() );
        employeeResponse.setDateOfBirth( employeeEntity.getDateOfBirth() );
        employeeResponse.setGender( employeeEntity.getGender() );
        employeeResponse.setId( employeeEntity.getId() );
        employeeResponse.setName( employeeEntity.getName() );

        return employeeResponse;
    }
}
