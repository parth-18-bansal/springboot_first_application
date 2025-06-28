package com.parth.firstProject.dto;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeDto {
    private Long id;
    private String name;
    private LocalDate dateOfJoining;
    private boolean isActive;

    // public EmployeeDto(
    //     Long id,
    //     String name,
    //     LocalDate dateOfJoining,
    //     boolean isActive
    // ){
    //     this.id = id;
    //     this.name = name;
    //     this.dateOfJoining = dateOfJoining;
    //     this.isActive = isActive;
    // }

    // public long getId(){
    //     return id;
    // }

    // public String getName(){
    //     return name;
    // }

    // public LocalDate getDateOfJoining(){
    //     return dateOfJoining;
    // }

    // public boolean getIsActive(){
    //     return isActive;
    // }


}
