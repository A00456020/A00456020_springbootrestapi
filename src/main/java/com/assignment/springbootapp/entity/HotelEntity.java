package com.assignment.springbootapp.entity;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "hotels")
public class HotelEntity {

    public int id;
    public String name;
    public String website_url;
    public int total_number_of_rooms;

    public HotelEntity(int id, String name, String website_url, int total_number_of_rooms, int available_rooms) {
        this.id = id;
        this.name = name;
        this.website_url = website_url;
        this.total_number_of_rooms = total_number_of_rooms;
        this.available_rooms = available_rooms;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWebsite_url() {
        return website_url;
    }

    public void setWebsite_url(String website_url) {
        this.website_url = website_url;
    }

    public int getTotal_number_of_rooms() {
        return total_number_of_rooms;
    }

    public void setTotal_number_of_rooms(int total_number_of_rooms) {
        this.total_number_of_rooms = total_number_of_rooms;
    }

    public int getAvailable_rooms() {
        return available_rooms;
    }

    public void setAvailable_rooms(int available_rooms) {
        this.available_rooms = available_rooms;
    }

    public int available_rooms;
}
