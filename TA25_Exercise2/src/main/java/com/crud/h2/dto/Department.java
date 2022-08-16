package com.crud.h2.dto;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;


@Entity
@Table(name="departments")
public class Department {
	/**Attributes */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)//Find the last value and increment from final id of db
	private Long code;

	private String name;
	
	private int budget;

    @OneToMany
    @JoinColumn(name="code") 
    private List<Employee> employee;

    /**Constructors */
    
    public Department() {
    	
    }
	/**
	 * @param code
	 * @param name
	 * @param budget
	 * @param employee
	 */
	public Department(Long code, String name, int budget) {
		this.code = code;
		this.name = name;
		this.budget = budget;
	}
	
	/**Getters y Setters*/

	/**
	 * @return the code
	 */
	public Long getCode() {
		return code;
	}
	/**
	 * @param code the code to set
	 */
	public void setCode(Long code) {
		this.code = code;
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
	 * @return the budget
	 */
	public int getBudget() {
		return budget;
	}
	/**
	 * @param budget the budget to set
	 */
	public void setBudget(int budget) {
		this.budget = budget;
	}
	/**
	 * @return the employee
	 */
	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "Employee")
	public List<Employee> getEmployee() {
		return employee;
	}
	/**
	 * @param employee the employee to set
	 */
	public void setEmployee(List<Employee> employee) {
		this.employee = employee;
	}
    
	//Method printing data by console
	@Override
	public String toString() {
		return "Departamento [codigo=" + code + ", nombre=" + name + ", presupuesto=" + budget;
	}

	
    
	
}
