package com.example.tiendadonchucho.servicios;

import java.util.List;

public interface ServicioComun<E> {

        //solo queremos 2 operaciones. buscar productos y agregar productos.

    public List<E> buscarTodos(); //hay que configurar unas excepciones. "throw"
    public E buscarPorId(Integer id);
    public E agregar(E datos);


}
