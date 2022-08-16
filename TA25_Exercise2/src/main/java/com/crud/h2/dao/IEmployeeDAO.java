package com.crud.h2.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crud.h2.dto.Employee;

public interface IEmployeeDAO extends JpaRepository<Employee, String>{

}

