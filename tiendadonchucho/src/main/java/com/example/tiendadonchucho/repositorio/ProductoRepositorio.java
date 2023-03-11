package com.example.tiendadonchucho.repositorio;

import com.example.tiendadonchucho.entidades.Producto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestBody;

@Repository
public interface ProductoRepositorio extends JpaRepository<Producto,Integer> {
}
