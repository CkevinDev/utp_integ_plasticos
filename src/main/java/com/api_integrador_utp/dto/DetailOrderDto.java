package com.api_integrador_utp.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class DetailOrderDto {
    private String nombre;
    private int cantidad;
    private double precio;
    private double total;
}
