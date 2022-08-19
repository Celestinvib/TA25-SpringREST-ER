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

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="manufacturers")
public class Manufacturer {

	/**Attributes */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)//Find the last value and increment from final id of db
	private Long id;
	
	private String name;
	
    @OneToMany
    @JoinColumn(name="id")
    private List<Item> item;

	/**Constructors */
	public Manufacturer() {
	}
	
	/**
	 * @param code
	 * @param name
	 */
	public Manufacturer(Long id, String name) {
		this.id = id;
		this.name = name;
	}



	/**Getters y Setters*/

	/**
	 * @return the code
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @param code the code to set
	 */
	public void setId(Long id) {
		this.id = id;
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
	 * @return the item
	 */
	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "Item")
	public List<Item> getItem() {
		return item;
	}

	/**
	 * @param item the item to set
	 */
	public void setItem(List<Item> item) {
		this.item = item;
	}
	
	//Method printing data by console
	@Override
	public String toString() {
		return "Fabricante [codigo=" + id + ", nombre=" + name;
	}
	
}
