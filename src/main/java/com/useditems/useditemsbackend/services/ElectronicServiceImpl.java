package com.useditems.useditemsbackend.services;

import com.useditems.useditemsbackend.dao.ElectronicRepo;
import com.useditems.useditemsbackend.dao.UserRepo;
import com.useditems.useditemsbackend.model.Electronic;
import com.useditems.useditemsbackend.model.User;

import java.util.List;
import java.util.Optional;

public class ElectronicServiceImpl implements ElectronicService{

    private final ElectronicRepo electronicRepo;


    //Constructor Injection
    public ElectronicServiceImpl(ElectronicRepo electronicRepo) {
        this.electronicRepo = electronicRepo;
    }

    @Override
    public void saveElectronic(Electronic electronic) {
        if(electronic != null)
            electronicRepo.save(electronic);
    }

    @Override
    public List<Electronic> findAllElectronics() {
        return electronicRepo.findAll();
    }

    @Override
    public Electronic findById(Long id) {
        Optional<Electronic> optionalElectronic = electronicRepo.findById(id);
        if(optionalElectronic.isPresent()){
            return optionalElectronic.get();
        }else{
            return new Electronic();
        }
    }

    @Override
    public void deleteById(Long id) {electronicRepo.deleteById(id);}
}
