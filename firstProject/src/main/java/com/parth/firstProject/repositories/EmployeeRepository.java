package com.parth.firstProject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.parth.firstProject.entities.EmployeeEntity;

@Repository
public interface EmployeeRepository extends JpaRepository<EmployeeEntity, Long>  {
    // here Long is the type of the primary key that we define in the entity class i.e id here
}
