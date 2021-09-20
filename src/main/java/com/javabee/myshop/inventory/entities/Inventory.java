package com.javabee.myshop.inventory.entities;

import javax.persistence.Column;
import javax.persistence.Entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
public class Inventory extends BaseEntity {

    @Column(unique = true, nullable = false)
    Long skuId;
    @Column(columnDefinition = "integer default 0")
    int stockLevel;
    @Column(columnDefinition = "integer default 0")
    int backOrderLevel;
    @Column(columnDefinition = "integer default 0")
    int preOrderLevel;

}
