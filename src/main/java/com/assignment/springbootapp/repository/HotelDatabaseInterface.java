package com.assignment.springbootapp.repository;

import com.assignment.springbootapp.entity.HotelEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HotelDatabaseInterface extends JpaRepository<HotelEntity, Integer> {
}
