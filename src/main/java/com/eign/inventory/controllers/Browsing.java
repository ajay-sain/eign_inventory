package com.eign.inventory.controllers;

import com.eign.inventory.models.*;
import com.eign.inventory.services.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/browse")
public class Browsing {

    private final ProductService pService;
    private final ManufacturerService mService;
    private final CategoryService cService;

    @Autowired
    Browsing(ProductService pService, ManufacturerService mService, CategoryService cService){
        this.cService = cService;
        this.mService = mService;
        this.pService = pService;
    }

    @GetMapping("/product")
    private List<Product> getAllProduct(){
        return pService.getAllProducts();
    }

    @GetMapping("/manufacturer")
    private List<Manufacturer> getAllManufacturer(){
        return mService.getAllManufacturers();
    }

    @GetMapping("/category")
    private List<Category> getAllCategory(){
        return cService.getAllRepository();
    }
}
