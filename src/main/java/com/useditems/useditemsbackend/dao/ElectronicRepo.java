package com.useditems.useditemsbackend.dao;

import com.useditems.useditemsbackend.model.Car;
import com.useditems.useditemsbackend.model.Electronic;
import org.springframework.data.repository.CrudRepository;

public interface ElectronicRepo extends CrudRepository<Electronic,Long> {
}
