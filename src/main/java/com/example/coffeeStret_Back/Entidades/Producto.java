package com.example.coffeeStret_Back.Entidades;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@Data
@Entity
@NoArgsConstructor
public class Producto {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idProducto;

    private String nombre;

    private String descripcion;

    private Double precio;

    private int popularidad;

}
