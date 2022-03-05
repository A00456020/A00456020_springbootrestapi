package com.assignment.springbootapp.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HotelController {
    @GetMapping("/hello")
    public String sayHi(){
        return "Hello!";
    }
}
