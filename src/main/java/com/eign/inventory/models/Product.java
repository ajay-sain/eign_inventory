package com.eign.inventory.models;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
public class Product {
    @Id
    private Long productId;
    private String productName;
    private Integer units;
    private String picture;
    private Double weight;
    private Long categoryId;
    private Double price;
    private String productDescription;
    private Long manufacturerId;
}