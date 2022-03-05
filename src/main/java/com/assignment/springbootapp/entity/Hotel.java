package com.assignment.springbootapp.entity;

public class Hotel {

    public Hotel(int id, String name, String website_url, int total_number_of_rooms, int available_rooms) {
        this.id = id;
        this.name = name;
        this.website_url = website_url;
        this.total_number_of_rooms = total_number_of_rooms;
        this.available_rooms = available_rooms;
    }

    public int id;
    public String name;
    public String website_url;
    public int total_number_of_rooms;
    public int available_rooms;
}
