package com.example.coffeeStret_Back.Controlador;

import com.example.coffeeStret_Back.Entidades.Producto;
import com.example.coffeeStret_Back.Servicio.ProductoServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/producto")
@CrossOrigin(origins = "http://localhost:4200")
public class ProductoControlador {
    @Autowired
    private ProductoServicio servicio;

    @GetMapping("/listar")
    public List<Producto> lisatar(){
        return servicio.listarTodo();
    }

}
