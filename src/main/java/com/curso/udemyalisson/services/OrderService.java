package com.curso.udemyalisson.services;

import com.curso.udemyalisson.entities.Order;
import com.curso.udemyalisson.repositories.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderService {

    @Autowired
    private OrderRepository repository;

    //Return all orders
    public List<Order> findAll(){
        return repository.findAll();
    }

    //Return orders by Id
    public Order findById(Long id){
        Optional<Order> obj = repository.findById(id);
        return obj.get();
    }
}
