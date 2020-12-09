package com.useditems.useditemsbackend.dao;

import com.useditems.useditemsbackend.model.Car;
import com.useditems.useditemsbackend.model.Furniture;
import org.springframework.data.repository.CrudRepository;

public interface FurnitureRepo extends CrudRepository<Furniture,Long> {
}
