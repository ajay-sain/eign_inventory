package com.eign.inventory.services;

import com.eign.inventory.models.Category;
import com.eign.inventory.repos.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService {

    private final CategoryRepository repo;

    @Autowired
    CategoryService(CategoryRepository repo){
        this.repo = repo;
    }

    public List<Category> getAllRepository(){
        return repo.findAll();
    }
}
