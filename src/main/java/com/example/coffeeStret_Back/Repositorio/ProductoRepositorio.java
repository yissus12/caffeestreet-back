package com.example.coffeeStret_Back.Repositorio;

import com.example.coffeeStret_Back.Entidades.Producto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductoRepositorio extends JpaRepository<Producto,Long> {
}
