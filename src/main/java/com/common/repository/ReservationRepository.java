package com.common.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.common.entity.Reservation;

@Repository
public interface ReservationRepository extends JpaRepository<Reservation, String>{

	
	
}
