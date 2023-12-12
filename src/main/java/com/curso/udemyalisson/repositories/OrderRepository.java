package com.curso.udemyalisson.repositories;

import com.curso.udemyalisson.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

//OrderRepository class especification and id
public interface OrderRepository extends JpaRepository<Order,Long> {
}
