package com.guigarap.projetowebservices.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.guigarap.projetowebservices.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
    
}
