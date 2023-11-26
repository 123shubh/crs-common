package com.common.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.common.entity.Hotel;


@Repository
public interface HotelRepository extends JpaRepository<Hotel, String>{

}
