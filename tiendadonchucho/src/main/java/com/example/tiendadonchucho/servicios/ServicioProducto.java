package com.example.tiendadonchucho.servicios;

import com.example.tiendadonchucho.entidades.Producto;
import com.example.tiendadonchucho.repositorio.ProductoRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ServicioProducto implements ServicioComun<Producto> { //se hace generico ServicioComun para cualquier clase


    @Autowired
    ProductoRepositorio productoRepositorio; //inyeccion de dependencia


    @Override
    public List<Producto> buscarTodos() throws Exception {
        try {
                List<Producto> productos = productoRepositorio.findAll();
                return productos;

        }catch(Exception error){
            throw new Exception(error.getMessage());
        }
    }

    @Override
    public Producto buscarPorId(Integer id) throws Exception {
        try {
            Optional<Producto> producto = productoRepositorio.findById(id); //es opcional que haya un producto
            return producto.get();

        }catch (Exception error){
            throw new Exception(error.getMessage());
        }
    }

    @Override
    public Producto agregar(Producto datos) throws Exception{
        try {
                datos=productoRepositorio.save(datos);
                return datos;
        }catch (Exception error){
            throw new Exception(error.getMessage());
        }
    }
}
