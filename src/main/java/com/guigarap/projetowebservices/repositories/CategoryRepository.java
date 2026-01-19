package com.guigarap.projetowebservices.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.guigarap.projetowebservices.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {
    
}
