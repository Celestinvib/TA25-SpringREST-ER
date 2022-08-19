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

import com.crud.h2.dto.Item;
import com.crud.h2.service.ItemServiceImpl;

@RestController
@RequestMapping("/api")
public class ItemController {
	
	@Autowired
	ItemServiceImpl itemServiceImpl;
	
	@GetMapping("/articulos")
	public List<Item> listItems(){
		return itemServiceImpl.listItems();
	}
	
	@PostMapping("/articulos")
	public Item saveItem(@RequestBody Item item) {
		
		return itemServiceImpl.saveItem(item);
	}
	
	@GetMapping("/articulos/{id}")
	public Item itemXID(@PathVariable(name="id") Long id) {
		
		Item item_xid= new Item();
		
		item_xid= itemServiceImpl.itemXID(id);
		
		System.out.println("Artiuclo XID: "+item_xid);
		
		return item_xid;
	}
	
	@PutMapping("/articulos/{id}")
	public Item updateItem(@PathVariable(name="id")Long id,@RequestBody Item item) {
		
		Item itemSelected= new Item();
		Item itemUpdated = new Item();
		
		itemSelected= itemServiceImpl.itemXID(id);
		
		itemSelected.setName(item.getName());
		itemSelected.setPrice(item.getPrice());
		itemSelected.setManufacturer(item.getManufacturer());
	
		itemUpdated = itemServiceImpl.updateItem(itemSelected);
		
		System.out.println("El fabricante actualizado es: "+ itemUpdated);
		
		return itemUpdated;
	}
	
	@DeleteMapping("/articulos/{id}")
	public void deleteItem(@PathVariable(name="id")Long id) {
		itemServiceImpl.deleteItem(id);
	}	


}
