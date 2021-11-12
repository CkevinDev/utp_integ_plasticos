package com.api_integrador_utp.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
public class DetailOrder {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String nombre;
    private int cantidad;
    private double precio;
    private double total;

    @OneToOne
    private Order order;
    @ManyToOne
    private Producto producto;

}
