package com.useditems.useditemsbackend.controller;

import com.useditems.useditemsbackend.model.Electronic;
import com.useditems.useditemsbackend.services.ElectronicService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = { "http://localhost:3000"})
@RestController
public class ElectronicsController {

    private final ElectronicService electronicService;

    public ElectronicsController(ElectronicService electronicService) {
        this.electronicService = electronicService;
    }

    @PostMapping("/electronic")
    public Electronic createElectronic(@RequestBody Electronic electronic){
        electronic.setId(0L);
        electronicService.saveElectronic(electronic);
        return electronic;

    }

    @GetMapping("/electronic")
    public List<Electronic> retrieveAllElectronics(){
        return electronicService.findAllElectronics();
    }

    @GetMapping("/electronic/{id}")
    public Electronic findById(@PathVariable Long id){

        if(electronicService.findById(id).getId()==0){
            return null;
        }else{
            return electronicService.findById(id);
        }
    }

    @PutMapping("/updateElectronic")
    public Electronic update(@RequestBody Electronic electronic){
        electronicService.saveElectronic(electronic);
        return electronic;
    }

    @DeleteMapping("/electronic/{id}")
    public void deleteUserByName(@PathVariable Long id){

        electronicService.deleteById(id);
    }
}
