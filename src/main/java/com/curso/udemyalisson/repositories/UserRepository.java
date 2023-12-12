package com.curso.udemyalisson.repositories;

import com.curso.udemyalisson.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

//UserRepository class especification and id
public interface UserRepository extends JpaRepository<User,Long> {
}
