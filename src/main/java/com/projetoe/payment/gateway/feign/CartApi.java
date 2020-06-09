package com.projetoe.payment.gateway.feign;

import com.projetoe.payment.controller.domain.CheckoutItemRequest;
import com.projetoe.payment.gateway.feign.model.ApiCartResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(name = "CartApi", url = "https://127.0.0.1:8080")
public interface CartApi {
    @PostMapping("/catalog/{buyerId}")
    ApiCartResponse execute(@PathVariable("buyerId") String buyerId, @RequestBody CheckoutItemRequest checkoutItemRequest);
}
