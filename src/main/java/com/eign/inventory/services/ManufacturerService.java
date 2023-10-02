package com.eign.inventory.services;

import com.eign.inventory.models.Manufacturer;
import com.eign.inventory.repos.ManufacturerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ManufacturerService {

    private final ManufacturerRepository repo;

    @Autowired
    ManufacturerService(ManufacturerRepository repo){
        this.repo = repo;
    }

    public List<Manufacturer> getAllManufacturers(){
        return repo.findAll();
    }
}
