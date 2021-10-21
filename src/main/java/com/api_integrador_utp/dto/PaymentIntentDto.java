package com.api_integrador_utp.dto;

import com.api_integrador_utp.emun.Currency;

public class PaymentIntentDto {
    private String descripcion;
    private int amount;
    private Currency currency;

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public Currency getCurrency() {
        return currency;
    }

    public void setCurrency(Currency currency) {
        this.currency = currency;
    }
}
