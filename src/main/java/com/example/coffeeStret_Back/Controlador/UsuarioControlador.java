package com.example.coffeeStret_Back.Controlador;

import com.example.coffeeStret_Back.Entidades.Usuario;
import com.example.coffeeStret_Back.ServicoImpl.UsuarioServicoImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/usuario")
@CrossOrigin(origins = "http://localhost:4200")
public class UsuarioControlador{
    @Autowired
    UsuarioServicoImpl servicoImpl;

    @PostMapping
    public ResponseEntity<Usuario> crearUsuario(@RequestBody Usuario usuario){
        Usuario usuarioNuevo= servicoImpl.agregarUsuario(usuario);
        return ResponseEntity.status(HttpStatus.CREATED).body(usuarioNuevo);
    }
}
