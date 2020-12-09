package com.useditems.useditemsbackend.controller;
import com.useditems.useditemsbackend.model.Furniture;
import com.useditems.useditemsbackend.model.User;
import com.useditems.useditemsbackend.services.FurnitureService;
import com.useditems.useditemsbackend.services.UserService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class FurnitureRestController {

    private final FurnitureService furnitureService;

    public FurnitureRestController(@Qualifier("FurnitureServiceImpl") FurnitureService furnitureService) {
        this.furnitureService = furnitureService;
    }


    @PostMapping("/furniture")
    public Furniture create(@RequestBody Furniture furniture){
        furniture.setId(0L);
        furnitureService.save(furniture);
        return furniture;

    }

    @GetMapping("/furniture")
    public List<Furniture> retrieveAll(){
        return furnitureService.findAll();
    }

    @GetMapping("/furniture/{id}")
    public Furniture findById(@PathVariable  Long id){

        if(furnitureService.findById(id).getId()==0){
            return null;
        }else{
            return furnitureService.findById(id);
        }
    }

    @PutMapping("/updateFurniture")
    public Furniture update(@RequestBody Furniture furniture){
        furnitureService.save(furniture);
        return furniture;
    }

    @DeleteMapping("/furniture/{id}")
    public void deleteById(@PathVariable Long id){

        furnitureService.deleteById(id);
    }


}
