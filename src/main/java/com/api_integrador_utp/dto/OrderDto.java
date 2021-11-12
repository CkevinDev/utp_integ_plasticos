package com.api_integrador_utp.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class OrderDto {
    private String numero;
    private Date fechaCreacion;
    private Date fechaRecibida;
    private double total;
}
