package com.cars.api;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cars.api.dto.CarDTO;

@RestController
@RequestMapping("/api/cars")
public class CarsController {

  @PostMapping
  public CarDTO createCar(@RequestBody CarDTO car) {
    System.out.println(car.modelo());
    System.out.println(car.fabricante());
    System.out.println(car.dataFabricacao());
    System.out.println(car.valor());
    System.out.println(car.anoModelo());
    return car;
  }
}
