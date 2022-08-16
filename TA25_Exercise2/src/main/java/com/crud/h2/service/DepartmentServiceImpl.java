package com.crud.h2.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crud.h2.dao.IDepartmentDAO;
import com.crud.h2.dto.Department;

@Service
public class DepartmentServiceImpl implements IDepartmentService{

	//We use the methods of the IDepartmentDAO interface, it is as if we were instantiating.
	@Autowired
	IDepartmentDAO iDepartmentDAO;
	
	@Override
	public List<Department> listDepartments() {
		
		return iDepartmentDAO.findAll();
	}

	@Override
	public Department saveDepartment(Department department) {
		
		return iDepartmentDAO.save(department);
	}

	@Override
	public Department departmentXID(Long id) {
		
		return iDepartmentDAO.findById(id).get();
	}

	@Override
	public Department updateDepartment(Department department) {
		
		return iDepartmentDAO.save(department);
	}

	@Override
	public void deleteDepartment(Long id) {
		
		iDepartmentDAO.deleteById(id);
	}

}
