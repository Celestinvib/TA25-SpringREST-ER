package com.crud.h2.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crud.h2.dao.IRoomDAO;
import com.crud.h2.dto.Room;

@Service
public class RoomServiceImpl implements IRoomService{
	//We use the methods of the IRoomDAO interface, it is as if we were instantiating.
	@Autowired
	IRoomDAO iRoomDAO;

	@Override
	public List<Room> listRooms() {
		
		return iRoomDAO.findAll();
	}

	@Override
	public Room saveRoom(Room room) {
		
		return iRoomDAO.save(room);
	}

	@Override
	public Room roomXID(Long code) {
		
		return iRoomDAO.findById(code).get();
	}

	@Override
	public Room updateRoom(Room room) {
		
		return iRoomDAO.save(room);
	}

	@Override
	public void deleteRoom(Long code) {
		
		iRoomDAO.deleteById(code);
	}
}
