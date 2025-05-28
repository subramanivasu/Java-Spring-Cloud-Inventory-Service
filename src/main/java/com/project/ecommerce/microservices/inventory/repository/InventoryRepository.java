package com.project.ecommerce.microservices.inventory.repository;

import com.project.ecommerce.microservices.inventory.model.Inventory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InventoryRepository extends JpaRepository<Inventory, Long> {

    boolean existsBySkuCodeAndQuantityGreaterThanEqual(
            String skuCode, Integer quantity);
}
