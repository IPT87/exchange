package com.optimissa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.optimissa.entities.User;

public interface UserRepository extends JpaRepository<User, String> {

}
