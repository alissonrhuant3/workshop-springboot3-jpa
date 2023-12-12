package com.curso.udemyalisson.services;

import com.curso.udemyalisson.entities.Category;
import com.curso.udemyalisson.repositories.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepository repository;

    //Return all categories
    public List<Category> findAll(){
        return repository.findAll();
    }

    //Return categories by Id
    public Category findById(Long id){
        Optional<Category> obj = repository.findById(id);
        return obj.get();
    }
}
