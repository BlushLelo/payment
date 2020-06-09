package com.projetoe.payment.api;

import com.projetoe.payment.controller.domain.CheckoutRequest;
import com.projetoe.payment.controller.domain.CheckoutResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("checkout")
public interface CheckoutApi {

    @PostMapping(path = "/{buyerId}")
    ResponseEntity<CheckoutResponse> execute(@RequestBody CheckoutRequest checkoutRequest, @PathVariable("buyerId") String buyerId);
}
