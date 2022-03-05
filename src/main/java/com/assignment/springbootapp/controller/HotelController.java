package com.assignment.springbootapp.controller;


import com.assignment.springbootapp.repository.HotelDatabaseInterface;
import com.assignment.springbootapp.entity.HotelEntity;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

@RestController
public class HotelController {

    HotelDatabaseInterface hdi = new HotelDatabaseInterface() {
        @Override
        public List<HotelEntity> findAll() {
            return null;
        }

        @Override
        public List<HotelEntity> findAll(Sort sort) {
            return null;
        }

        @Override
        public List<HotelEntity> findAllById(Iterable<Integer> integers) {
            return null;
        }

        @Override
        public <S extends HotelEntity> List<S> saveAll(Iterable<S> entities) {
            return null;
        }

        @Override
        public void flush() {

        }

        @Override
        public <S extends HotelEntity> S saveAndFlush(S entity) {
            return null;
        }

        @Override
        public <S extends HotelEntity> List<S> saveAllAndFlush(Iterable<S> entities) {
            return null;
        }

        @Override
        public void deleteAllInBatch(Iterable<HotelEntity> entities) {

        }

        @Override
        public void deleteAllByIdInBatch(Iterable<Integer> integers) {

        }

        @Override
        public void deleteAllInBatch() {

        }

        @Override
        public HotelEntity getOne(Integer integer) {
            return null;
        }

        @Override
        public HotelEntity getById(Integer integer) {
            return null;
        }

        @Override
        public <S extends HotelEntity> List<S> findAll(Example<S> example) {
            return null;
        }

        @Override
        public <S extends HotelEntity> List<S> findAll(Example<S> example, Sort sort) {
            return null;
        }

        @Override
        public Page<HotelEntity> findAll(Pageable pageable) {
            return null;
        }

        @Override
        public <S extends HotelEntity> S save(S entity) {
            return null;
        }

        @Override
        public Optional<HotelEntity> findById(Integer integer) {
            return Optional.empty();
        }

        @Override
        public boolean existsById(Integer integer) {
            return false;
        }

        @Override
        public long count() {
            return 0;
        }

        @Override
        public void deleteById(Integer integer) {

        }

        @Override
        public void delete(HotelEntity entity) {

        }

        @Override
        public void deleteAllById(Iterable<? extends Integer> integers) {

        }

        @Override
        public void deleteAll(Iterable<? extends HotelEntity> entities) {

        }

        @Override
        public void deleteAll() {

        }

        @Override
        public <S extends HotelEntity> Optional<S> findOne(Example<S> example) {
            return Optional.empty();
        }

        @Override
        public <S extends HotelEntity> Page<S> findAll(Example<S> example, Pageable pageable) {
            return null;
        }

        @Override
        public <S extends HotelEntity> long count(Example<S> example) {
            return 0;
        }

        @Override
        public <S extends HotelEntity> boolean exists(Example<S> example) {
            return false;
        }

        @Override
        public <S extends HotelEntity, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction) {
            return null;
        }
    };

    @GetMapping("/hello")
    public String sayHi(){
        return "Hello!";
    }

    @GetMapping("/hotel")
    public HotelEntity getHotels(@RequestParam(value="id", defaultValue = "1") int id){
        return new HotelEntity(id, "Ahmedabad Inn", "", 280, 26);
    }

    @GetMapping("/hotels")
    public List<HotelEntity> getListOfHotels(){

        return hdi.findAll();

    }
}
