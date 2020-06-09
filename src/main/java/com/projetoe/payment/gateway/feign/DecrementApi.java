package com.projetoe.payment.gateway.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "DecrementApi", url = "https://127.0.0.1:8080")
public interface DecrementApi {

    @DeleteMapping("/catalog/{itemId}")
    void execute(@PathVariable("itemId") String itemId);
}
