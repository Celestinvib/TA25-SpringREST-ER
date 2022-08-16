package com.crud.h2.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crud.h2.dao.IDepartmentDAO;
import com.crud.h2.dao.IEmployeeDAO;
import com.crud.h2.dto.Department;
import com.crud.h2.dto.Employee;

@Service
public class EmployeeServiceImpl implements IEmployeeService{

	//We use the methods of the IEmployeeDAO interface, it is as if we were instantiating.
	@Autowired
	IEmployeeDAO iEmployeeDAO;

	@Override
	public List<Employee> listEmployees() {

		return iEmployeeDAO.findAll();
	}

	@Override
	public Employee saveEmployee(Employee employee) {
		
		return iEmployeeDAO.save(employee);
	}

	@Override
	public Employee employeeXDNI(String DNI) {
		
		return iEmployeeDAO.findById(DNI).get();
	}

	@Override
	public Employee updateEmployee(Employee employee) {
		
		return iEmployeeDAO.save(employee);
	}

	@Override
	public void deleteEmployee(String DNI) {
		
		iEmployeeDAO.deleteById(DNI);
	}
	
	

}
