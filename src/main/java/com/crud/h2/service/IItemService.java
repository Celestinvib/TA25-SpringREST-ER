package com.crud.h2.service;

import java.util.List;

import com.crud.h2.dto.Item;

public interface IItemService {
	//CRUD methods
	public List<Item> listItems(); //List All 
	
	public Item saveItem(Item item);//Save a new item "CREATE"
	
	public Item itemXID(Long id); //Read data from a item "READ"
			
	public Item updateItem(Item item); //Update item data "UPDATE"
	
	public void deleteItem(Long id);// Delete a item via id "DELETE"
}
