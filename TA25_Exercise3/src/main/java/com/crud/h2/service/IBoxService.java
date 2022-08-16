package com.crud.h2.service;

import java.util.List;

import com.crud.h2.dto.Box;

public interface IBoxService {
	//CRUD methods
	public List<Box> listBoxes(); //List All 
	
	public Box saveBox(Box box);//Save a new box "CREATE"
	
	public Box boxXID(Long refNumber); //Read data from a box "READ"
			
	public Box updateBox(Box box); //Update box data "UPDATE"
	
	public void deleteBox(Long refNumber);// Delete a box via id "DELETE"
}
