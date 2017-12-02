package com.example.jvm.demo.controller;

import com.example.jvm.demo.entity.Car;
import com.example.jvm.demo.repository.CarRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/cars")
public class CarController {

    @Autowired
    CarRepo repo;

    @GetMapping("")
    public Iterable<Car> getAllCar(){
        return repo.findAll();
    }

    @PostMapping("")
    public Car saveCar(@RequestBody Car car){
        return repo.save(car);
    }

    @GetMapping("{id}/findById")
    public Car findById(@PathVariable(value = "id") String id){
        return repo.findOne(Long.parseLong(id));
    }

    @DeleteMapping("{id}/delete")
    public void deleteCar(@PathVariable(value = "id") String id){
        repo.delete(Long.parseLong(id));
    }

    @GetMapping("/findByBrand")
    public List<Car> findCarByBrand(@RequestParam(value = "brand") String brand){
        return repo.findCarByBrand(brand);
    }
}
