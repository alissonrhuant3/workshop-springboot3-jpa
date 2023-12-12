package com.curso.udemyalisson.repositories;

import com.curso.udemyalisson.entities.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;

//OrderItemRepository class especification and id
public interface OrderItemRepository extends JpaRepository<OrderItem,Long> {
}
