package com.projetoe.payment.usecase;

import com.projetoe.payment.controller.domain.CheckoutRequest;
import com.projetoe.payment.controller.domain.CheckoutResponse;
import com.projetoe.payment.domain.CheckoutItem;
import com.projetoe.payment.gateway.CartApiGateway;
import com.projetoe.payment.gateway.DecrementApiGateway;
import com.projetoe.payment.translator.Translator;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
@RequiredArgsConstructor
public class CheckoutUseCase {

    public static final String SUCCESS = "success";

    private final CartApiGateway cartApiGateway;
    private final DecrementApiGateway decrementApiGateway;

    public CheckoutResponse execute(CheckoutRequest checkoutRequest, String buyerId) {
        String ccNumber = checkoutRequest.getCard().getCredicardNumber();
        String response = mockCardInfos(ccNumber.substring(ccNumber.length() - 1));
        List<CheckoutItem> itemList = checkoutRequest.getCart().stream().map(item -> Translator.translate(item, CheckoutItem.class)).collect(Collectors.toList());
        itemList.forEach(item -> {
            cartApiGateway.execute(item, buyerId);
            decrementApiGateway.execute(item.getId());
        });
        return new CheckoutResponse(response);
    }


    public String mockCardInfos(String lastCCdigit) {
        switch (lastCCdigit) {
            case "2": {
                return "no limit";
            }
            case "3": {
                return "transaction denied";
            }
            default: {
                return SUCCESS;
            }
        }
    }
}
