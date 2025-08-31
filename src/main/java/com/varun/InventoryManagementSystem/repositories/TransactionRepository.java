package com.varun.InventoryManagementSystem.repositories;

import com.varun.InventoryManagementSystem.models.Transaction;
import com.varun.InventoryManagementSystem.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.util.Optional;

public interface TransactionRepository extends JpaRepository<Transaction, Long>, JpaSpecificationExecutor<Transaction> {




}