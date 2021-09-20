package com.javabee.myshop.inventory.bootstrap;

import java.util.ArrayList;
import java.util.List;

import com.javabee.myshop.inventory.entities.Inventory;
import com.javabee.myshop.inventory.repository.InventoryRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;

//@Component
public class DataLoader implements CommandLineRunner {

    @Autowired
    InventoryRepository inventoryRepository;

    @Override
    public void run(String... args) throws Exception {
        loadInventory();
    }

    public void loadInventory() {

        Inventory sku1 = new Inventory(1L, 100, 0, 0);
        Inventory sku2 = new Inventory(2L, 100, 0, 0);
        Inventory sku3 = new Inventory(3L, 100, 0, 0);
        Inventory sku4 = new Inventory(4L, 100, 0, 0);
        Inventory sku5 = new Inventory(5L, 100, 0, 0);

        List<Inventory> inventories = new ArrayList<>();
        inventories.add(sku1);
        inventories.add(sku2);
        inventories.add(sku3);
        inventories.add(sku4);
        inventories.add(sku5);

        inventoryRepository.saveAll(inventories);
    }
}
