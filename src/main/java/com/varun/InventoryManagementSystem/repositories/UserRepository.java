package com.varun.InventoryManagementSystem.repositories;

import com.varun.InventoryManagementSystem.models.Supplier;
import com.varun.InventoryManagementSystem.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {

    Optional<User> findByEmail(String email);

}