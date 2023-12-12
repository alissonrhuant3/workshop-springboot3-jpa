package com.curso.udemyalisson.services;

import com.curso.udemyalisson.entities.Product;
import com.curso.udemyalisson.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    @Autowired
    private ProductRepository repository;

    //Return all products
    public List<Product> findAll(){
        return repository.findAll();
    }

    //Return products by Id
    public Product findById(Long id){
        Optional<Product> obj = repository.findById(id);
        return obj.get();
    }
}
