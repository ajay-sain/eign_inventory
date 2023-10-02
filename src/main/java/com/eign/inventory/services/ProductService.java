package com.eign.inventory.services;

import com.eign.inventory.models.Product;
import com.eign.inventory.repos.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    private final ProductRepository repo;

    @Autowired
    ProductService(ProductRepository repo){
        this.repo = repo;
    }

    public List<Product> getAllProducts(){
        return repo.findAll();
    }
}
