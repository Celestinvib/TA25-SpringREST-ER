package com.crud.h2.service;

import java.util.List;

import com.crud.h2.dto.Employee;

public interface IEmployeeService {
	//CRUD methods
	public List<Employee> listEmployees(); //List All employees
	
	public Employee saveEmployee(Employee employee);	//Save a new employee "CREATE"
	
	public Employee employeeXDNI(String DNI); //Read data from a employee "READ"
			
	public Employee updateEmployee(Employee employee); //Update employee data "UPDATE"
	
	public void deleteEmployee(String DNI);// Delete a employee via id "DELETE"
}
