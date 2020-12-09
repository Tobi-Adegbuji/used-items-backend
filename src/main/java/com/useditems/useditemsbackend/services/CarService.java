package com.useditems.useditemsbackend.services;

import com.useditems.useditemsbackend.model.Car;
import com.useditems.useditemsbackend.model.User;

import java.util.List;

public interface CarService {

    Car saveCar(Car car);

    List<Car> findAllCars();

    Car findById(Long id);

    void deleteById(Long id);

}
