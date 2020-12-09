package com.useditems.useditemsbackend.services;

import com.useditems.useditemsbackend.model.Furniture;
import com.useditems.useditemsbackend.model.User;

import java.util.List;

public interface FurnitureService {
    void save(Furniture furniture);

    List<Furniture> findAll();


    Furniture findById(Long id);

    void deleteById(Long id);
}
