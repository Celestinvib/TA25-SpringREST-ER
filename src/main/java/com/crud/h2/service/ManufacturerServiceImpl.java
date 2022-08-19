package com.crud.h2.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crud.h2.dao.IManufacturerDAO;
import com.crud.h2.dto.Manufacturer;

@Service
public class ManufacturerServiceImpl implements IManufacturerService{

	//We use the methods of the IManufacturerDAO interface, it is as if we were instantiating.
	@Autowired
	IManufacturerDAO iManufacturerDAO;
	
	@Override
	public List<Manufacturer> listManufacturers() {
		return iManufacturerDAO.findAll();
	}

	@Override
	public Manufacturer saveManufacturer(Manufacturer manufacturer) {
		return iManufacturerDAO.save(manufacturer);
	}

	@Override
	public Manufacturer manufacturerXID(Long id) {
		return iManufacturerDAO.findById(id).get();
	}

	@Override
	public Manufacturer updateManufacturer(Manufacturer manufacturer) {
		return iManufacturerDAO.save(manufacturer);
	}

	@Override
	public void deleteManufacturer(Long id) {
		iManufacturerDAO.deleteById(id);		
	}

}
