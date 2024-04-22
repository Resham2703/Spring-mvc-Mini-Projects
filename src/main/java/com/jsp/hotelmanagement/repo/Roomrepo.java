package com.jsp.hotelmanagement.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.jsp.hotelmanagement.dto.Room;

public interface Roomrepo extends JpaRepository<Room, Integer> {

	@Query("select r from Room r where r.room_id=?1")
	public Room getRoombyid(int rid);

	@Query("select r from Room r where r.room_no=?1")
	public Room getRoombyno(int room_no);

	@Query("select r from Room r where r.avilability=?1")
	public List<Room> getAvilability(String avilability);

	@Query("select r from Room r where r.room_type=?1")
	public List<Room> getRoombytype(String room_type);

}