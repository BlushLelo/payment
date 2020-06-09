package com.projetoe.payment.gateway.feign.model;

import java.util.List;

public class ApiCartResponse {
    private String cartId;
    private String buyerId;
    private List<Item> itemsList;
    private double cartTotals;
    private boolean closed;

}
