package com.example.coffeeStret_Back.ServicoImpl;

import com.example.coffeeStret_Back.Entidades.Usuario;
import com.example.coffeeStret_Back.Repositorio.UsuarioRepositorio;
import com.example.coffeeStret_Back.Servicio.UsuarioServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioServicoImpl implements UsuarioServicio {
    @Autowired
    UsuarioRepositorio repositorio;

    @Override
    public Usuario agregarUsuario(Usuario usuario) {
        usuario.setFechaRegistro(new java.sql.Timestamp(System.currentTimeMillis()));
        return repositorio.save(usuario);
    }
}


