package com.useditems.useditemsbackend.services;

import com.useditems.useditemsbackend.dao.CarRepo;
import com.useditems.useditemsbackend.model.Car;
import com.useditems.useditemsbackend.model.User;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CarServiceImpl implements CarService{


    private final CarRepo carRepo;

    public CarServiceImpl(CarRepo carRepo) {
        this.carRepo = carRepo;
    }

    @Override
    public Car saveCar(Car car) {
        if(car != null)
            carRepo.save(car);
        return car;
    }

    @Override
    public List<Car> findAllCars() {
        return carRepo.findAll();
    }

    @Override
    public Car findById(Long id) {
        Optional<Car> optionalCar = carRepo.findById(id);
        //If car is not present, then return a Car
        return optionalCar.orElseGet(Car::new);
    }

    @Override
    public void deleteById(Long id) {
        carRepo.deleteById(id);
    }
}
