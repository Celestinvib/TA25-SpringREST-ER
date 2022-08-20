package com.crud.h2.dto;

import java.util.List;

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
@Table(name="warehouses")
public class Warehouse {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)//Find the last value and increment from final id of db
	private Long id;
	
	private int code;
	
	private String place;
	
	private int capacity; 
	
	 @OneToMany
	 @JoinColumn(name="id")
	 private List<Box> box;	
	 
	 /**Constructors */
	 
	 public Warehouse() {
		 
	 }
	
	/**
	 * @param id
	 * @param code
	 * @param place
	 * @param capacity
	 */
	public Warehouse(Long id, int code, String place, int capacity) {
		this.id = id;
		this.code = code;
		this.place = place;
		this.capacity = capacity;
	}





	/**Getters y Setters*/

	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * @return the code
	 */
	public int getCode() {
		return code;
	}

	/**
	 * @param code the code to set
	 */
	public void setCode(int code) {
		this.code = code;
	}

	/**
	 * @return the place
	 */
	public String getPlace() {
		return place;
	}

	/**
	 * @param place the place to set
	 */
	public void setPlace(String place) {
		this.place = place;
	}

	/**
	 * @return the capacity
	 */
	public int getCapacity() {
		return capacity;
	}

	/**
	 * @param capacity the capacity to set
	 */
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	/**
	 * @return the box
	 */
	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "Box")	
	public List<Box> getBox() {
		return box;
	}

	/**
	 * @param box the box to set
	 */
	public void setBox(List<Box> box) {
		this.box = box;
	}


	
	//Method printing data by console
	@Override
	public String toString() {
		return "Almacen [codigo=" + code + ", lugar=" + place + ", capacidad=" + capacity;
	}

	


	 
	 
	 
}
