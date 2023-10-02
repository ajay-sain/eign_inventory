package com.eign.inventory.models;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
public class Manufacturer {
    @Id
    private Long manufacturerId;
    private String manufacturerName;
}
