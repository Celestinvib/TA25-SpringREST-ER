package com.crud.h2.service;

import java.util.List;

import com.crud.h2.dto.Manufacturer;


public interface IManufacturerService {
	//CRUD methods
	public List<Manufacturer> listManufacturers(); //List All 
	
	public Manufacturer saveManufacturer(Manufacturer manufacturer);	//Save a new manufacturer "CREATE"
	
	public Manufacturer manufacturerXID(Long id); //Read data from a manufacturer "READ"
			
	public Manufacturer updateManufacturer(Manufacturer manufacturer); //Update manufacturer data "UPDATE"
	
	public void deleteManufacturer(Long id);// Delete a manufacturer via id "DELETE"
	
}
