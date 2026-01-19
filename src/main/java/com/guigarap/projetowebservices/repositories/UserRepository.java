package com.guigarap.projetowebservices.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.guigarap.projetowebservices.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
    
}
