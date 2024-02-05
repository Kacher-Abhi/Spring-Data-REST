package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.example.demo.entity.Employee;

@RepositoryRestResource(path="members")
public interface EmployeeRepo extends JpaRepository<Employee,Long> {

}