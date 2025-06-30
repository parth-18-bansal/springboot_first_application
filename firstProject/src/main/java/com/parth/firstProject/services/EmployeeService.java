package com.parth.firstProject.services;

import org.springframework.stereotype.Service;
import com.parth.firstProject.dto.EmployeeDto;
import com.parth.firstProject.entities.EmployeeEntity;
import com.parth.firstProject.repositories.EmployeeRepository;

@Service
public class EmployeeService {

    final EmployeeRepository employeeRepository;

    public EmployeeService(EmployeeRepository employeeRepository){
        this.employeeRepository = employeeRepository;
    }

    public EmployeeDto getEmployeesById(Long id) {
        EmployeeEntity employeeEntity = employeeRepository.getById(id);
        return new EmployeeDto(employeeEntity.getId(), employeeEntity.getName(),employeeEntity.getDateOfJoining(),employeeEntity.isActive());

    }

    public createNewEmployee(){
        
    }

}
