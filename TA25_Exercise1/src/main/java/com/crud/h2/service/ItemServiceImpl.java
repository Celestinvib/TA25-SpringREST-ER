package com.crud.h2.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crud.h2.dao.IItemDAO;
import com.crud.h2.dto.Item;

@Service
public class ItemServiceImpl implements IItemService{
	
	//We use the methods of the IItemDAO interface, it is as if we were instantiating.
	@Autowired
	IItemDAO iItemDAO;

	@Override
	public List<Item> listItems() {
		return iItemDAO.findAll();
	}

	@Override
	public Item saveItem(Item item) {
		return iItemDAO.save(item);
	}

	@Override
	public Item itemXID(Long id) {
		return iItemDAO.findById(id).get();
	}

	@Override
	public Item updateItem(Item item) {
		return iItemDAO.save(item);
	}

	@Override
	public void deleteItem(Long id) {
		iItemDAO.deleteById(id);		
	}

}
