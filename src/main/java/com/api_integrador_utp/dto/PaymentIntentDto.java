package com.api_integrador_utp.dto;

import com.api_integrador_utp.emun.Currency;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PaymentIntentDto {
    private String descripcion;
    private int amount;
    private Currency currency;
}
