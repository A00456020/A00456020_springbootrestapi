package com.assignment.springbootapp.controller;


import com.assignment.springbootapp.repository.HotelDatabaseInterface;
import com.assignment.springbootapp.entity.HotelEntity;
import com.assignment.springbootapp.service.HotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

@RestController
public class HotelController {

    @Autowired
    HotelService hoteldb;

    @GetMapping("/hello")
    public String sayHi(){
        return "Hello!";
    }

    @GetMapping("/hotel")
    public HotelEntity getHotels(@RequestParam(value="id", defaultValue = "1") int id){
        return new HotelEntity(id, "Ahmedabad Inn", "", 280, 26);
    }

    @GetMapping("/all_hotels")
    public List<HotelEntity> getListOfHotels(){

        return hoteldb.listHotels();

    }

    @PostMapping("/add_hotel")
    public String addHotel(@RequestBody HotelEntity new_hotel){
        return hoteldb.insertHotel(new_hotel);
    }

    @PostMapping("/delete_hotel")
    public String deleteHotel(@RequestParam(value = "id", defaultValue = "1") int hotelid){
        return hoteldb.deleteHotel(hotelid);
    }

}
