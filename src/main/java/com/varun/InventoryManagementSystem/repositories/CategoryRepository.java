package com.varun.InventoryManagementSystem.repositories;

import com.varun.InventoryManagementSystem.models.Category;
import com.varun.InventoryManagementSystem.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
