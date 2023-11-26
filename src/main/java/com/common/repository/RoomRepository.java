package com.common.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.common.entity.Room;


@Repository
public interface RoomRepository extends JpaRepository<Room, String> {

	
	@Query(nativeQuery = true,value = "select * from room inner join hotel where room.room_Id=?1 and hotel.hotel_Id=?2")
	public Room checkIfConfiguredWithHotel(String roomId, String hotelId);

}
