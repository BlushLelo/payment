package com.projetoe.payment.controller.domain;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
public class CheckoutRequest {

    private String sellerId;
    private List<CheckoutItemRequest> cart;
    private CardRequest card;

}
