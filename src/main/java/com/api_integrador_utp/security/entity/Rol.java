package com.api_integrador_utp.security.entity;

import com.api_integrador_utp.security.enums.RolNombre;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@NoArgsConstructor
@Getter
@Setter
public class Rol {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @NotNull
    @Enumerated(EnumType.STRING)
    private RolNombre rolNombre;


    public Rol(@NotNull RolNombre rolNombre) {
        this.rolNombre = rolNombre;
    }

}
