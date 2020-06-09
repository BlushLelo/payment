package com.projetoe.payment.gateway;

import com.projetoe.payment.domain.CheckoutItem;
import com.projetoe.payment.gateway.model.CartResponse;

public interface CartApiGateway {
    CartResponse execute(CheckoutItem checkoutItem, String buyerId);
}
