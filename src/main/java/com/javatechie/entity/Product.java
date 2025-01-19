package com.javatechie.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@NamedStoredProcedureQueries({
        @NamedStoredProcedureQuery(
                name = "updateStockProcedure",
                procedureName = "update_stock",
                parameters = {
                        @StoredProcedureParameter(mode = ParameterMode.IN, name = "productId", type = Integer.class),
                        @StoredProcedureParameter(mode = ParameterMode.IN, name = "quantity", type = Integer.class)
                }
        )
})

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private double price;
    private int stockQuantity;

}
