package com.crud.h2.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crud.h2.dao.IWarehouseDAO;
import com.crud.h2.dto.Warehouse;

@Service
public class WarehouseServiceImpl implements IWarehouseService{
	//We use the methods of the IWarehouseDAO interface, it is as if we were instantiating.
	@Autowired
	IWarehouseDAO iWarehouseDAO;

	@Override
	public List<Warehouse> listWarehouses() {
		
		return iWarehouseDAO.findAll();
	}

	@Override
	public Warehouse saveWarehouse(Warehouse warehouse) {
		
		return iWarehouseDAO.save(warehouse);
	}

	@Override
	public Warehouse warehouseXID(Long code) {
		
		return iWarehouseDAO.findById(code).get();
	}

	@Override
	public Warehouse updateWarehouse(Warehouse warehouse) {
		
		return iWarehouseDAO.save(warehouse);
	}

	@Override
	public void deleteWarehouse(Long code) {
		
		iWarehouseDAO.deleteById(code);
	}


}
