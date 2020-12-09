package com.useditems.useditemsbackend.services;

import com.useditems.useditemsbackend.model.Electronic;
import com.useditems.useditemsbackend.model.User;

import java.util.List;

public interface ElectronicService {
    void saveElectronic(Electronic electronic);

    List<Electronic> findAllElectronics();


    Electronic findById(Long id);

    void deleteById(Long id);
}
