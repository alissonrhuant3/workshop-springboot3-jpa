package com.curso.udemyalisson.repositories;

import com.curso.udemyalisson.entities.Category;
import com.curso.udemyalisson.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

//CategoryRepository class especification and type id
public interface CategoryRepository extends JpaRepository<Category,Long> {
}
