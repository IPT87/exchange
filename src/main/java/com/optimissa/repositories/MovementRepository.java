package com.optimissa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.optimissa.entities.Movement;

@Repository
public interface MovementRepository extends JpaRepository<Movement, Integer> {

}
