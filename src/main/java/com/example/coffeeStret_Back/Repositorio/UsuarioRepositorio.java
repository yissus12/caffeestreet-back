package com.example.coffeeStret_Back.Repositorio;

import com.example.coffeeStret_Back.Entidades.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepositorio extends JpaRepository<Usuario,Long> {
}
