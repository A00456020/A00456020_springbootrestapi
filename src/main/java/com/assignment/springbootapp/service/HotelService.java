package com.assignment.springbootapp.service;

import com.assignment.springbootapp.entity.HotelEntity;
import com.assignment.springbootapp.repository.HotelDatabaseInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class HotelService {
    @Autowired
    HotelDatabaseInterface hdi;

    public List<HotelEntity> listHotels(){
        return hdi.findAll();
    }

    public String insertHotel(HotelEntity hotel){
        hdi.save(hotel);
        return "{\"Message\": \"Inserted Successfully!\"}";
    }

    public String deleteHotel(Integer hotelid){
        hdi.deleteById(hotelid);
        return "{\"Message\": \"Deleted Successfully!\"}";
    }
}
