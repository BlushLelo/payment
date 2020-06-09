package com.projetoe.payment.domain;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CheckoutItem {
    private String id;
    private String sellerName;
    private String productName;
    private String images;
    private String description;
    private float price;
    private int quantity;
}
