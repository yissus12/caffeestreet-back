package com.example.coffeeStret_Back.ServicoImpl;

import com.example.coffeeStret_Back.Entidades.Producto;
import com.example.coffeeStret_Back.Repositorio.ProductoRepositorio;
import com.example.coffeeStret_Back.Servicio.ProductoServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductoServicoImpl implements ProductoServicio {

    @Autowired
    private  ProductoRepositorio repositorio;

    @Override
    public List<Producto> listarTodo() {
    return repositorio.findAll();
    }
}
