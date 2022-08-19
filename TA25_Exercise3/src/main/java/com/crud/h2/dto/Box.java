package com.crud.h2.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="boxes")
public class Box {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)//Find the last value and increment from final id of db
	private Long id;
	
	private int refNumber;

	private String content;
	
	private int value;
	
	@ManyToOne
    @JoinColumn(name="warehouse_code")
    private Warehouse warehouse;

	 /**Constructors */	
	public Box() {
	}

	/**
	 * @param id
	 * @param refNumber
	 * @param content
	 * @param value
	 */
	public Box(Long id, int refNumber, String content, int value) {
		this.id = id;
		this.refNumber = refNumber;
		this.content = content;
		this.value = value;
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
	 * @return the refNumber
	 */
	public int getRefNumber() {
		return refNumber;
	}

	/**
	 * @param refNumber the refNumber to set
	 */
	public void setRefNumber(int refNumber) {
		this.refNumber = refNumber;
	}

	/**
	 * @return the content
	 */
	public String getContent() {
		return content;
	}

	/**
	 * @param content the content to set
	 */
	public void setContent(String content) {
		this.content = content;
	}

	/**
	 * @return the value
	 */
	public int getValue() {
		return value;
	}

	/**
	 * @param value the value to set
	 */
	public void setValue(int value) {
		this.value = value;
	}

	/**
	 * @return the warehouse
	 */
	public Warehouse getWarehouse() {
		return warehouse;
	}

	/**
	 * @param warehouse the warehouse to set
	 */
	public void setWarehouse(Warehouse warehouse) {
		this.warehouse = warehouse;
	}
		
	//Method printing data by console
	@Override
	public String toString() {
		return "Caja [numReferencia=" + refNumber + ", contenido=" + content + ", valor=" + value+ ", almacen=" + warehouse;
	}

	
	
	
	
}
