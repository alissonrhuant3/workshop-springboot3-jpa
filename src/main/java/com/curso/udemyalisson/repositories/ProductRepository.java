package com.curso.udemyalisson.repositories;

import com.curso.udemyalisson.entities.Category;
import com.curso.udemyalisson.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

//ProductRepository class especification and type id
public interface ProductRepository extends JpaRepository<Product,Long> {
}
