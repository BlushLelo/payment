package com.projetoe.payment.controller;

import com.projetoe.payment.api.CheckoutApi;
import com.projetoe.payment.controller.domain.CheckoutRequest;
import com.projetoe.payment.controller.domain.CheckoutResponse;
import com.projetoe.payment.usecase.CheckoutUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*")
@RestController
@RequiredArgsConstructor
public class CheckoutController implements CheckoutApi {

    private final CheckoutUseCase checkoutUseCase;

    @Override
    public ResponseEntity<CheckoutResponse> execute(CheckoutRequest checkoutRequest, String buyerId) {
        return new ResponseEntity<>(checkoutUseCase.execute(checkoutRequest, buyerId), HttpStatus.OK);

    }
}
