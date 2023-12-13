package com.curso.udemyalisson.services;

import com.curso.udemyalisson.entities.User;
import com.curso.udemyalisson.repositories.UserRepository;
import com.curso.udemyalisson.services.exceptions.ResourceNotFoundException;
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

    //Return users by Id, orElseThrow if null throws an exception specified in the lambda expression
    public User findById(Long id){
        Optional<User> obj = repository.findById(id);
        return obj.orElseThrow(() -> new ResourceNotFoundException(id));
    }

    //save new user
    public User insert(User obj){
        return repository.save(obj);
    }

    //delete user
    public void delete(Long id){
        repository.deleteById(id);
    }

    //update User; getReferenceById() Works with the object in the background so that changes can be made to the database later
    public User update(Long id, User obj){
        User entity = repository.getReferenceById(id);
        updateData(entity, obj);
        return repository.save(entity);
    }

    private void updateData(User entity, User obj) {
        entity.setName(obj.getName());
        entity.setEmail(obj.getEmail());
        entity.setPhone(obj.getPhone());
    }

}
