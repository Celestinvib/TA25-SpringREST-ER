package com.crud.h2.dto;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="boxes")
public class Box {
	@Id
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
	 * @param refNumber
	 * @param content
	 * @param value
	 * @param warehouse
	 */
	public Box(int refNumber, String content, int value, Warehouse warehouse) {
		this.refNumber = refNumber;
		this.content = content;
		this.value = value;
		this.warehouse = warehouse;
	}

	/**Getters y Setters*/

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
