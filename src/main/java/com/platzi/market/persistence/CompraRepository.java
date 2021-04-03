package com.platzi.market.persistence;

import com.platzi.market.persistence.crud.CompraCrudRepository;
import com.platzi.market.persistence.entity.Compra;

import java.time.LocalDateTime;
import java.util.List;

public class CompraRepository {

    private CompraCrudRepository compraCrudRepository;

    //Obtener todas las compras de un cliente
    public List<Compra> getByIdCliente(int idCliente){
        return compraCrudRepository.findByIdClienteOrderByIdProductoAsc(idCliente);
    }

    //Obtener todas las ventas de una fecha
    public List<Compra> getByFechaCompra(LocalDateTime fecha){
        return compraCrudRepository.findByFecha(fecha);
    }

    //Obtener todas las ventas de un cliente en una fecha
    public List<Compra> getByFechaCompraCliente(LocalDateTime fecha, int idCliente){
        return compraCrudRepository.findByFechaAndIdClienteOrderByIdClienteAsc(fecha, idCliente);
    }
    //Obtener todas las ventas de un cliente en una fecha
    public List<Compra> getByFechaCompraClienteMedioPago(LocalDateTime fecha, int idCliente, String medioPago){
        return compraCrudRepository.findByFechaAndAndIdClienteAndMedioPagoOrderByFechaAsc(fecha, idCliente, medioPago);
    }



}
