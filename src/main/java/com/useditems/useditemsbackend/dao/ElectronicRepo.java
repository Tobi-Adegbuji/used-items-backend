package com.useditems.useditemsbackend.dao;

import com.useditems.useditemsbackend.model.Car;
import com.useditems.useditemsbackend.model.Electronic;
import com.useditems.useditemsbackend.model.User;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ElectronicRepo extends CrudRepository<Electronic,Long> {
    List<Electronic> findAll();
}
