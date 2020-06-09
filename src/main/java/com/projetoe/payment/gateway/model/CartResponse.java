package com.projetoe.payment.gateway.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class CartResponse {
    private String cartId;
    private String buyerId;
    private List<Item> itemsList;
    private double cartTotals;
    private boolean closed;
}
