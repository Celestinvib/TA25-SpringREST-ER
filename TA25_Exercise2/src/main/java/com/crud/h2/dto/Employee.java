package com.crud.h2.dto;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="employees")
public class Employee {
	/**Attributes */
	@Id
	private String DNI;
	
	private String name;

	private String surnames;
	
	@ManyToOne
    @JoinColumn(name="dpt_code")
    private Department department;

    /**Constructors */

	public Employee() {
	}


	/**
	 * @param dNI
	 * @param name
	 * @param surnames
	 * @param departament
	 */
	public Employee(String dNI, String name, String surnames, Department department) {
		this.DNI = dNI;
		this.name = name;
		this.surnames = surnames;
		this.department = department;
	}

	/**Getters y Setters*/

	/**
	 * @return the dNI
	 */
	public String getDNI() {
		return DNI;
	}


	/**
	 * @param dNI the dNI to set
	 */
	public void setDNI(String dNI) {
		DNI = dNI;
	}


	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}


	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}


	/**
	 * @return the surnames
	 */
	public String getSurnames() {
		return surnames;
	}


	/**
	 * @param surnames the surnames to set
	 */
	public void setSurnames(String surnames) {
		this.surnames = surnames;
	}


	/**
	 * @return the department
	 */
	public Department getDepartment() {
		return department;
	}


	/**
	 * @param departament the department to set
	 */
	public void setDepartment(Department departament) {
		this.department = departament;
	}

	//Method printing data by console
	@Override
	public String toString() {
		return "Empleado [DNI =" + DNI + ", nombre =" + name + ", apellidos=" + surnames + ", departamento=" + department + "]";
	}
	
	
	
	

}
