package com.api_integrador_utp.dto;

import com.api_integrador_utp.security.entity.Usuario;
import lombok.Getter;
import lombok.Setter;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;

@Setter
@Getter
public class ProductoDto {

    @NotBlank
    private String nombre;
    private String descripcion;
    private String imagenUrl;
    private String imagenId;
    private String material;
    @NotBlank
    @Min(0)
    private  double precio;
    private int cantidad;
    private Usuario usuario;


}
