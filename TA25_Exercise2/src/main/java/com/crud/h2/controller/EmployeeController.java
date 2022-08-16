package com.crud.h2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.crud.h2.dto.Employee;
import com.crud.h2.service.EmployeeServiceImpl;

@RestController
@RequestMapping("/api")
public class EmployeeController {

	@Autowired
	EmployeeServiceImpl employeeServiceImpl;
	
	
	@GetMapping("/empleado")
	public List<Employee> listEmployees(){
		return employeeServiceImpl.listEmployees();
	}
	
	@PostMapping("/empleado")
	public Employee saveEmployee(@RequestBody Employee employee) {
		
		return employeeServiceImpl.saveEmployee(employee);
	}
	
	@GetMapping("/empleado/{DNI}")
	public Employee EmployeeXID(@PathVariable(name="DNI") String DNI) {
		
		Employee employee_xDNI= new Employee();
		
		employee_xDNI= employeeServiceImpl.employeeXDNI(DNI);
		
		System.out.println("Empleado XID: "+employee_xDNI);
		
		return employee_xDNI;
	}
	
	@PutMapping("/empleado/{DNI}")
	public Employee updateEmployee(@PathVariable(name="DNI") String DNI,@RequestBody Employee employee) {
		
		Employee employeeSelected= new Employee();
		Employee employeetUpdated = new Employee();
		
		employeeSelected= employeeServiceImpl.employeeXDNI(DNI);
		
		employeeSelected.setName(employee.getName());
		employeeSelected.setSurnames(employee.getSurnames());
		employeeSelected.setDepartment(employee.getDepartment());
	
		employeetUpdated = employeeServiceImpl.updateEmployee(employeeSelected);
		
		System.out.println("El empleado actualizado es: "+ employeetUpdated);
		
		return employeetUpdated;
	}
	
	@DeleteMapping("/empleado/{DNI}")
	public void deleteEmployee(@PathVariable(name="DNI") String DNI) {
		employeeServiceImpl.deleteEmployee(DNI);
	}	
}
