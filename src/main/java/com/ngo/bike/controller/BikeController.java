package com.ngo.bike.controller;

import com.ngo.bike.model.Bike;
import com.ngo.bike.repository.BikeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/bikes")
public class BikeController {

    @Autowired
    private BikeRepository bikeRepository;
    @GetMapping
    public List<Bike> list(){
      //  List<Bike> bikes = new ArrayList<>();
        return bikeRepository.findAll() ;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.OK )
    public void create(@RequestBody Bike bike){

        bikeRepository.save(bike);
    }

    @GetMapping(value = "/{id}")
    public Bike get(@PathVariable("id") long id ){
        return bikeRepository.findById(Long.valueOf(id)).get();
    }

}
