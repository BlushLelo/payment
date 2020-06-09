package com.projetoe.payment.controller.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CardRequest {
    private String cardHolder;
    private String credicardNumber;
    private String cvv;
    private String expirationCCDate;
}
