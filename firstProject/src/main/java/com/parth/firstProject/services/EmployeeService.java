package com.parth.firstProject.services;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import com.parth.firstProject.dto.EmployeeDto;
import com.parth.firstProject.entities.EmployeeEntity;
import com.parth.firstProject.repositories.EmployeeRepository;

@Service
public class EmployeeService {

    final EmployeeRepository employeeRepository;
    final ModelMapper modelMapper;

    public EmployeeService(EmployeeRepository employeeRepository,
                            ModelMapper modelMapper){
        this.employeeRepository = employeeRepository;
        this.modelMapper = modelMapper;
    }

    public EmployeeDto getEmployeesById(Long id) {
        EmployeeEntity employeeEntity = employeeRepository.getById(id);
        // this is manual way of conversion between the entity and dto
        // return new EmployeeDto(employeeEntity.getId(), employeeEntity.getName(),employeeEntity.getDateOfJoining(),employeeEntity.isActive());

        // to avoid the manual conversion of the entity and dto we can use model mapper library.
        return modelMapper.map(employeeEntity,EmployeeDto.class);

    }

    public EmployeeDto createNewEmployee(EmployeeDto employeeDto){
         EmployeeEntity employeeEntity = modelMapper.map(employeeDto, EmployeeEntity.class);
         return modelMapper.map(employeeRepository.save(employeeEntity),EmployeeDto.class);
    }

}
