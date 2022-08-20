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

import com.crud.h2.dto.Box;
import com.crud.h2.service.BoxServiceImpl;

@RestController
@RequestMapping("/api")
public class BoxController {
	@Autowired
	BoxServiceImpl boxServiceImpl;
	
	@GetMapping("/cajas")
	public List<Box> listBoxes(){
		
		return boxServiceImpl.listBoxes();
	}
	
	@PostMapping("/cajas")
	public Box saveBox(@RequestBody Box box) {
		
		return boxServiceImpl.saveBox(box);
	}
	
	@GetMapping("/cajas/{id}")
	public Box boxXID(@PathVariable(name="id") Long id) {
		
		Box box_xrefNumber= new Box();
		
		box_xrefNumber= boxServiceImpl.boxXID(id);
		
		System.out.println("Caja XID: "+box_xrefNumber);
		
		return box_xrefNumber;
	}
	
	@PutMapping("/cajas/{id}")
	public Box updateBox(@PathVariable(name="id")Long id,@RequestBody Box box) {
		
		Box boxSelected= new Box();
		Box boxUpdated = new Box();
		
		boxSelected= boxServiceImpl.boxXID(id);
		
		boxSelected.setContent(box.getContent());
		boxSelected.setValue(box.getValue());
		boxSelected.setWarehouse(box.getWarehouse());
			
		boxUpdated = boxServiceImpl.updateBox(boxSelected);
		
		System.out.println("La caja actualizada es: "+ boxUpdated);
		
		return boxUpdated;
	}
	
	@DeleteMapping("/cajas/{id}")
	public void deleteBox(@PathVariable(name="id")Long id) {
		boxServiceImpl.deleteBox(id);
	}	
}
