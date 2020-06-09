package com.projetoe.payment.controller.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CheckoutItemRequest {
    @JsonProperty("name")
    private String sellerName;
    @JsonProperty("title")
    private String productName;
    @JsonProperty("img")
    private String images;
    @JsonProperty("desc")
    private String description;
    private float price;
    @JsonProperty("qtd")
    private int quantity;
}
