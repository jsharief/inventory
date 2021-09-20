package com.javabee.myshop.inventory.repository;

import javax.transaction.Transactional;

import com.javabee.myshop.inventory.entities.Inventory;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;

@Repository
@Transactional
public interface InventoryRepository extends ReactiveCrudRepository<Inventory, Long> {

}
