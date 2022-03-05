package com.assignment.springbootapp.controller;


import com.assignment.springbootapp.entity.Hotel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HotelController {
    @GetMapping("/hello")
    public String sayHi(){
        return "Hello!";
    }

    @GetMapping("/hotel")
    public Hotel getHotels(@RequestParam(value="id", defaultValue = "1") int id){
        return new Hotel(id, "Ahmedabad Inn", "", 280, 26);
    }
}
