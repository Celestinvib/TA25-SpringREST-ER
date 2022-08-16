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

import com.crud.h2.dto.Room;
import com.crud.h2.service.RoomServiceImpl;

@RestController
@RequestMapping("/api")
public class RoomController {
	@Autowired
	RoomServiceImpl roomServiceImpl;
	
	@GetMapping("/salas")
	public List<Room> listRooms(){
		
		return roomServiceImpl.listRooms();
	}
	
	@PostMapping("/salas")
	public Room saveRoom(@RequestBody Room room) {
		
		return roomServiceImpl.saveRoom(room);
	}
	
	@GetMapping("/salas/{code}")
	public Room roomXID(@PathVariable(name="code") Long code) {
		
		Room room_xid= new Room();
		
		room_xid= roomServiceImpl.roomXID(code);
		
		System.out.println("Sala XID: "+room_xid);
		
		return room_xid;
	}
	
	@PutMapping("/salas/{code}")
	public Room updateRoom(@PathVariable(name="code")Long code,@RequestBody Room room) {
		
		Room roomSelected= new Room();
		Room roomUpdated = new Room();
		
		roomSelected= roomServiceImpl.roomXID(code);
		
		roomSelected.setName(room.getName());
		roomSelected.setMovie(room.getMovie());
		
	
		roomUpdated = roomServiceImpl.updateRoom(roomSelected);
		
		System.out.println("La sala actualizada es: "+ roomUpdated);
		
		return roomUpdated;
	}
	
	@DeleteMapping("/salas/{code}")
	public void deleteRoom(@PathVariable(name="code")Long code) {
		roomServiceImpl.deleteRoom(code);
	}		

}
