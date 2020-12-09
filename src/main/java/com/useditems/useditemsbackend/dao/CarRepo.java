package com.useditems.useditemsbackend.dao;

import com.useditems.useditemsbackend.model.Car;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CarRepo extends CrudRepository<Car,Long> {
    List<Car> findAll();
}
