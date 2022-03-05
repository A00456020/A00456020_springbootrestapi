package com.assignment.springbootapp.controller;


import com.assignment.springbootapp.entity.HotelEntity;
import com.assignment.springbootapp.service.HotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class HotelController {

    @Autowired
    HotelService hoteldb;

    @GetMapping("/hello")
    public String sayHi(){
        return "Hello!";
    }

    @GetMapping("/hotel")
    public Optional<HotelEntity> getHotels(@RequestParam(value="id", defaultValue = "1") int id){
        return hoteldb.listHotel(id);
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
