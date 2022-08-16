package com.crud.h2.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crud.h2.dto.Department;

public interface IDepartmentDAO extends JpaRepository<Department, Long>{

}
