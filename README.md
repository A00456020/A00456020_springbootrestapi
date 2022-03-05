# A00456020_springbootrestapi
This is my repository for Spring Boot REST API assignment for MCDA 5550.

I am Parth Tarak Vaidya, A00456020, MCDA Fall 2021 cohort, Saint Mary's University, Halifax.

The database used is MySQL database created using the following sql commands:

create database springboot_db;
create user 'jdbc_user'@'localhost' identified by "root";
grant all privileges on springboot_db.* to 'jdbc_user'@'localhost';

To get the list of all the hotels, use:

http://localhost:8080/all_hotels  OR
GET Request to http://localhost:8080/all_hotels with empty body

To get a hotel by id, for example 7, use:

http://localhost:8080/hotel?id=7 OR
GET Request to http://localhost:8080/hotel with {"id":"7"}

to add new Hotel to database, use

POST Request to http://localhost:8080/add_hotel

{
"id": 7,
"name": "Ahmedabad Grand",
"website_url": "ahmedabadinn.com",
"total_number_of_rooms": 27,
"available_rooms": 7
}

to delete hotel by any id, use:

http://localhost:8080/delete_hotel?id=7

----------OR-------------------

POST Request to http://localhost:8080/delete_hotel
{"id": 7}

Thank you,
Parth Vaidya.
