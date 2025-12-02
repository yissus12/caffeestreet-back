package com.example.coffeeStret_Back.Entidades;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Usuario {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idUsuario;

    private String nombreUsuario;

    private String correoUsuario;

    private String contrasena;
    private String rol;
    private String estado = "activo";

    @Column(name = "fecha_registro", updatable = false)
    private java.sql.Timestamp fechaRegistro;

}
