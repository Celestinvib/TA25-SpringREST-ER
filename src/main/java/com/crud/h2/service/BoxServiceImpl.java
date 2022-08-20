package com.crud.h2.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crud.h2.dao.IBoxDAO;
import com.crud.h2.dao.IWarehouseDAO;
import com.crud.h2.dto.Box;

@Service
public class BoxServiceImpl implements IBoxService{
	//We use the methods of the IBoxDAO interface, it is as if we were instantiating.
	@Autowired
	IBoxDAO iBoxDAO;

	@Override
	public List<Box> listBoxes() {
		
		return iBoxDAO.findAll();
	}

	@Override
	public Box saveBox(Box box) {

		return iBoxDAO.save(box);
	}

	@Override
	public Box boxXID(Long id) {
		
		return iBoxDAO.findById(id).get();		
	}

	@Override
	public Box updateBox(Box box) {
		
		return iBoxDAO.save(box);
	}

	@Override
	public void deleteBox(Long id) {
		
		iBoxDAO.deleteById(id);
	}
	
	
	
}
