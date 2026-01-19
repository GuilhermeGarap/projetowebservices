package com.guigarap.projetowebservices.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.guigarap.projetowebservices.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
    
}
