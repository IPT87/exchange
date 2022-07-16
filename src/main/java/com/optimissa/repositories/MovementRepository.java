package com.optimissa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.optimissa.entities.Movement;

public interface MovementRepository extends JpaRepository<Movement, Integer> {

}
