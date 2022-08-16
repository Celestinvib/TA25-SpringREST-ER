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

import com.crud.h2.dto.Department;
import com.crud.h2.service.DepartmentServiceImpl;

@RestController
@RequestMapping("/api")
public class DepartmentController {

	@Autowired
	DepartmentServiceImpl departmentServiceImpl;
	
	@GetMapping("/departamento")
	public List<Department> listDepartments(){
		return departmentServiceImpl.listDepartments();
	}
	
	@PostMapping("/departamento")
	public Department saveManufacturer(@RequestBody Department department) {
		
		return departmentServiceImpl.saveDepartment(department);
	}
	
	@GetMapping("/departamento/{id}")
	public Department manufacturerXID(@PathVariable(name="id") Long id) {
		
		Department department_xid= new Department();
		
		department_xid= departmentServiceImpl.departmentXID(id);
		
		System.out.println("Departamento XID: "+department_xid);
		
		return department_xid;
	}
	
	@PutMapping("/departamento/{id}")
	public Department updateManufacturer(@PathVariable(name="id")Long id,@RequestBody Department department) {
		
		Department departmentSelected= new Department();
		Department departmentUpdated = new Department();
		
		departmentSelected= departmentServiceImpl.departmentXID(id);
		
		departmentSelected.setName(department.getName());
		departmentSelected.setBudget(department.getBudget());
	
		departmentUpdated = departmentServiceImpl.updateDepartment(departmentSelected);
		
		System.out.println("El departamento actualizado es: "+ departmentUpdated);
		
		return departmentUpdated;
	}
	
	@DeleteMapping("/departamento/{id}")
	public void deleteManufacturer(@PathVariable(name="id")Long id) {
		departmentServiceImpl.deleteDepartment(id);
	}	

}
