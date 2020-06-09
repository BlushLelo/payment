package com.projetoe.payment.gateway;

import com.projetoe.payment.gateway.feign.DecrementApi;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class DecrementApiGatewayImpl implements DecrementApiGateway {

    private final DecrementApi decrementApi;

    @Override
    public void execute(String itemId) {
        decrementApi.execute(itemId);
    }
}
