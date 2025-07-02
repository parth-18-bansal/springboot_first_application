package com.parth.firstProject.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import java.time.LocalDate;
import com.parth.firstProject.dto.EmployeeDto;
import com.parth.firstProject.services.EmployeeService;

import jakarta.websocket.server.PathParam;

//Operations
// GET /employees
// POST /employees
// DELETE /employees/{id}

@RestController
public class EmployeeController {

    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService){
        this.employeeService = employeeService;
    }

    @GetMapping(path = "/employees")
    public EmployeeDto getEmployees(){
        // here this object is automatically convert into the json in the output
        // here jackson named library converts the object into json and json into object
        return new EmployeeDto(1l,"parth",LocalDate.of(2001,12,18 ),true); 
    }

    // passing the data through path variable, it is for the compulsory parameters
    @GetMapping(path = "/employees/{id}")
    public EmployeeDto getEmployeesById(@PathVariable("id") Long employeeId){
        return employeeService.getEmployeesById(employeeId);
    }

    // pathparam for the optional parameters
    @GetMapping(path = "/employee")
    public String getData(
        @PathParam("sortBy") String sortBy,
        @PathParam("limit") String limit)
    {
        return "Hello World" + sortBy + limit;
    }

    // by the requestBody we can get all paramters in the url as a single object
    @PostMapping(path="/employee"){
        public EmployeeDto createNewEmployee(@RequestBody EmployeeDto employeeDto){
            return employeeService.createNewEmployee(employeeDto);
        }
    }
    
}
