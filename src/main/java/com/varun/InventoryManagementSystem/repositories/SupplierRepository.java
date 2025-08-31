package com.varun.InventoryManagementSystem.repositories;

import com.varun.InventoryManagementSystem.models.Product;
import com.varun.InventoryManagementSystem.models.Supplier;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SupplierRepository extends JpaRepository<Supplier, Long> {

}