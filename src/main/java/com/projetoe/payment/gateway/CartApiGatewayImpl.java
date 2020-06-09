package com.projetoe.payment.gateway;

import com.projetoe.payment.controller.domain.CheckoutItemRequest;
import com.projetoe.payment.domain.CheckoutItem;
import com.projetoe.payment.gateway.feign.CartApi;
import com.projetoe.payment.gateway.feign.model.ApiCartResponse;
import com.projetoe.payment.gateway.model.CartResponse;
import com.projetoe.payment.translator.Translator;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;


@RequiredArgsConstructor
@Component
public class CartApiGatewayImpl implements CartApiGateway {

    private final CartApi cartApi;

    @Override
    public CartResponse execute(CheckoutItem checkoutItem, String buyerId) {
        ApiCartResponse apiCartResponse = cartApi.execute(buyerId, Translator.translate(checkoutItem, CheckoutItemRequest.class));
        return Translator.translate(apiCartResponse, CartResponse.class);
    }
}
