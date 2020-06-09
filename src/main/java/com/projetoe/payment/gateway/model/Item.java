package com.projetoe.payment.gateway.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Item {
    private String sellerEmail;
    private String productName;
    private String images;
    private String description;
    private double price;
    private double quantity;
}
