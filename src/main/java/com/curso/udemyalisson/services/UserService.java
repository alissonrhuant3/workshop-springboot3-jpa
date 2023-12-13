package com.curso.udemyalisson.services;

import com.curso.udemyalisson.entities.User;
import com.curso.udemyalisson.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository repository;

    //Return all users
    public List<User> findAll(){
        return repository.findAll();
    }

    //Return users by Id
    public User findById(Long id){
        Optional<User> obj = repository.findById(id);
        return obj.get();
    }

    //save new user
    public User insert(User obj){
        return repository.save(obj);
    }

}
