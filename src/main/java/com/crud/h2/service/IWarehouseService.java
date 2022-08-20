package com.crud.h2.service;

import java.util.List;

import com.crud.h2.dto.Warehouse;

public interface IWarehouseService {
	//CRUD methods
	public List<Warehouse> listWarehouses(); //List All 
	
	public Warehouse saveWarehouse(Warehouse warehouse);//Save a new warehouse "CREATE"
	
	public Warehouse warehouseXID(Long code); //Read data from a warehouse "READ"
			
	public Warehouse updateWarehouse(Warehouse warehouse); //Update warehouse data "UPDATE"
	
	public void deleteWarehouse(Long code);// Delete a warehouse via id "DELETE"
}
