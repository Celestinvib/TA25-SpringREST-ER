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

import com.crud.h2.dto.Manufacturer;
import com.crud.h2.service.ManufacturerServiceImpl;

@RestController
@RequestMapping("/api")
public class ManufacturerController {
	
	@Autowired
	ManufacturerServiceImpl manufacturerServiceImpl;
	
	@GetMapping("/fabricantes")
	public List<Manufacturer> listManufacturers(){
		return manufacturerServiceImpl.listManufacturers();
	}
	
	@PostMapping("/fabricantes")
	public Manufacturer saveManufacturer(@RequestBody Manufacturer manufacturer) {
		
		return manufacturerServiceImpl.saveManufacturer(manufacturer);
	}
	
	@GetMapping("/fabricantes/{id}")
	public Manufacturer manufacturerXID(@PathVariable(name="id") Long id) {
		
		Manufacturer manufacturer_xid= new Manufacturer();
		
		manufacturer_xid= manufacturerServiceImpl.manufacturerXID(id);
		
		System.out.println("Fabricante XID: "+manufacturer_xid);
		
		return manufacturer_xid;
	}
	
	@PutMapping("/fabricantes/{id}")
	public Manufacturer updateManufacturer(@PathVariable(name="id")Long id,@RequestBody Manufacturer manufacturer) {
		
		Manufacturer manufacturerSelected= new Manufacturer();
		Manufacturer manufacturerUpdated = new Manufacturer();
		
		manufacturerSelected= manufacturerServiceImpl.manufacturerXID(id);
		
		manufacturerSelected.setName(manufacturer.getName());
	
		manufacturerUpdated = manufacturerServiceImpl.updateManufacturer(manufacturerSelected);
		
		System.out.println("El fabricante actualizado es: "+ manufacturerUpdated);
		
		return manufacturerUpdated;
	}
	
	@DeleteMapping("/fabricantes/{id}")
	public void deleteManufacturer(@PathVariable(name="id")Long id) {
		manufacturerServiceImpl.deleteManufacturer(id);
	}	

}
