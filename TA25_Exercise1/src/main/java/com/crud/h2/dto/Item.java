package com.crud.h2.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="items")
public class Item {

	/**Attributes */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)//Find the last value and increment from final id of db
	private Long id;
	
	private String name;

	private int price;
	
	@ManyToOne
    @JoinColumn(name="manufacturer_code")
	private Manufacturer manufacturer;
	

	/**Constructors */
	
	public Item() {
		
	}
	/**
	 * @param code
	 * @param name
	 * @param price
	 * @param manufacturer
	 */
	public Item(Long id, String name, int price, Manufacturer manufacturer) {
		this.id = id;
		this.name = name;
		this.price = price;
		this.manufacturer = manufacturer;
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
	 * @return the price
	 */
	public int getPrice() {
		return price;
	}
	/**
	 * @param price the price to set
	 */
	public void setPrice(int price) {
		this.price = price;
	}
	
	/**
	 * @return the manufacturer
	 */
	public Manufacturer getManufacturer() {
		return manufacturer;
	}
	/**
	 * @param manufacturer the manufacturer to set
	 */
	public void setManufacturer(Manufacturer manufacturer) {
		this.manufacturer = manufacturer;
	}
	
	//Method printing data by console
	@Override
	public String toString() {
		return "Articulo [codigo =" + id + ", nombre =" + name + ", precio=" + price + ", fabricante=" + manufacturer + "]";
	}
	
	
	
	

}
