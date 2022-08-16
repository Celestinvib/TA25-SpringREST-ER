package com.crud.h2.service;

import java.util.List;

import com.crud.h2.dto.Department;

public interface IDepartmentService {
	//CRUD methods
	public List<Department> listDepartments(); //List All departments
	
	public Department saveDepartment(Department department);	//Save a new department "CREATE"
	
	public Department departmentXID(Long id); //Read data from a department "READ"
			
	public Department updateDepartment(Department department); //Update department data "UPDATE"
	
	public void deleteDepartment(Long id);// Delete a department via id "DELETE"
}
