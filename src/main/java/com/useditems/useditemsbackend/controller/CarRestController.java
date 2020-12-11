package com.useditems.useditemsbackend.controller;

import com.useditems.useditemsbackend.model.Car;
import com.useditems.useditemsbackend.model.User;
import com.useditems.useditemsbackend.services.CarService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = { "http://localhost:3000"})
@RestController
public class CarRestController {


    private final CarService carService;

    public CarRestController(CarService carService) {
        this.carService = carService;
    }

    @ResponseStatus(HttpStatus.OK)
    @PostMapping("/cars")
    public Car createCar(@RequestBody Car car){
        //Setting ID to 0 in order to auto increment
        car.setId(0);
        carService.saveCar(car);
        return car;
    }

    //Retrieves list of cars from car repo
    @ResponseStatus(HttpStatus.OK)
    @GetMapping("/cars")
    public List<Car> retrieveAllCars(){
        return carService.findAllCars();
    }

    //Finds car by id from car repo
    @ResponseStatus(HttpStatus.OK)
    @GetMapping("/cars/{id}")
    public Car findById(@PathVariable Long id){
        if(carService.findById(id).getId()==0){
            return null;
        }else{
            return carService.findById(id);
        }
    }

    //Updates car in car repo
    @ResponseStatus(HttpStatus.OK)
    @PutMapping("/car")
    public Car update(@RequestBody Car car){
        carService.saveCar(car);
        return car;
    }

    //Deletes car by
    @ResponseStatus(HttpStatus.OK)
    @DeleteMapping("/cars/{id}")
    public void deleteCarById(@PathVariable Long id){
        carService.deleteById(id);
    }

}
