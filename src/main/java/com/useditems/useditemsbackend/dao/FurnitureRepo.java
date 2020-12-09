package com.useditems.useditemsbackend.dao;

import com.useditems.useditemsbackend.model.Car;
import com.useditems.useditemsbackend.model.Furniture;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface FurnitureRepo extends CrudRepository<Furniture,Long> {
    List<Furniture> findAll();
}
