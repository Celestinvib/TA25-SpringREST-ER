package com.crud.h2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.crud.h2.dto.Warehouse;
import com.crud.h2.service.WarehouseServiceImpl;

@RestController
@RequestMapping("/api")
public class WarehouseController {

	@Autowired
	WarehouseServiceImpl warehouseServiceImpl;
	
	@GetMapping("/almacenes")
	public List<Warehouse> listWarehouses(){
		
		return warehouseServiceImpl.listWarehouses();
	}
	
	@PostMapping("/almacenes")
	public Warehouse saveWarehouse(@RequestBody Warehouse warehouse) {
		
		return warehouseServiceImpl.saveWarehouse(warehouse);
	}
	
	@GetMapping("/almacenes/{id}")
	public Warehouse warehouseXID(@PathVariable(name="id") Long id) {
		
		Warehouse warehouse_xcode= new Warehouse();
		
		warehouse_xcode= warehouseServiceImpl.warehouseXID(id);
		
		System.out.println("Almacen XID: "+warehouse_xcode);
		
		return warehouse_xcode;
	}
	
	@PutMapping("/almacenes/{id}")
	public Warehouse updateWarehouse(@PathVariable(name="id")Long id,@RequestBody Warehouse warehouse) {
		
		Warehouse warehouseSelected= new Warehouse();
		Warehouse warehouseUpdated = new Warehouse();
		
		warehouseSelected= warehouseServiceImpl.warehouseXID(id);
		
		warehouseSelected.setPlace(warehouse.getPlace());
		warehouseSelected.setCapacity(warehouse.getCapacity());
	
		warehouseUpdated = warehouseServiceImpl.updateWarehouse(warehouseSelected);
		
		System.out.println("El almacen actualizado es: "+ warehouseUpdated);
		
		return warehouseUpdated;
	}
	
	@DeleteMapping("/almacenes/{id}")
	public void deleteWarehouse(@PathVariable(name="id")Long id) {
		warehouseServiceImpl.deleteWarehouse(id);
	}	
}
