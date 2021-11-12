package com.api_integrador_utp.entity;

import com.api_integrador_utp.security.entity.Usuario;
import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class Producto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @NotBlank
    private String nombre;
    @NotBlank
    private String descripcion;
    @NotBlank
    private String imagenUrl;
    @NotBlank
    private  String imagenId;
    @NotBlank
    private String material;
    @Min(value = 0)
    private double precio;
    @Min(value = 0)
    private int cantidad;
    @ManyToOne
    private Usuario usuario;

    public Producto(String nombre, String descripcion, String imagenUrl,String imagenId, String material, double precio, int cantidad, Usuario usuario) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.imagenUrl = imagenUrl;
        this.imagenId=imagenId;
        this.material = material;
        this.precio = precio;
        this.cantidad = cantidad;
        this.usuario = usuario;
    }
}
