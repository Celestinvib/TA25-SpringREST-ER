package com.crud.h2.service;

import java.util.List;

import com.crud.h2.dto.Room;

public interface IRoomService {
		//CRUD methods
		public List<Room> listRooms(); //List All 
		
		public Room saveRoom(Room room);//Save a new room "CREATE"
		
		public Room roomXID(Long code); //Read data from a room "READ"
				
		public Room updateRoom(Room room); //Update room data "UPDATE"
		
		public void deleteRoom(Long code);// Delete a room via id "DELETE"	

}
