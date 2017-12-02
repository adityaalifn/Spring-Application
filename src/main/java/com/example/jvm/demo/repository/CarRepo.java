package com.example.jvm.demo.repository;

import com.example.jvm.demo.entity.Car;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CarRepo extends CrudRepository<Car, Long>{
    List<Car> findCarByBrand(String brand);
}
