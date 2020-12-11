package com.useditems.useditemsbackend.services;

import com.useditems.useditemsbackend.dao.FurnitureRepo;
import com.useditems.useditemsbackend.model.Furniture;
import org.springframework.stereotype.Service;

import java.util.List;


@Service()
public class FurnitureServiceImpl implements FurnitureService{

    private final FurnitureRepo furnitureRepo;

    public FurnitureServiceImpl(FurnitureRepo furnitureRepo) {
        this.furnitureRepo = furnitureRepo;
    }


    @Override
    public void save(Furniture furniture) {
        if(furniture!=null){
            furnitureRepo.save(furniture);
        }
    }

    @Override
    public List<Furniture> findAll() {

        return furnitureRepo.findAll();
    }

    @Override
    public Furniture findById(Long id) {
        if (furnitureRepo.findById(id).isPresent()) {
            return furnitureRepo.findById(id).get();
        } else {
            return new Furniture();
        }
    }

    @Override
    public void deleteById(Long id) {
        furnitureRepo.deleteById(id);
    }
}
