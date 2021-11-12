package com.api_integrador_utp.security.dto;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotBlank;

@Setter
@Getter
public class LoginUsuario {
    @NotBlank
    private String username;
    @NotBlank
    private String password;
    private String nombre;
}
