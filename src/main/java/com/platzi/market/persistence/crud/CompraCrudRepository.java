package com.platzi.market.persistence.crud;

import com.platzi.market.persistence.entity.Compra;
import org.springframework.data.repository.CrudRepository;
import java.time.LocalDateTime;
import java.util.List;

public interface CompraCrudRepository extends CrudRepository<Compra, Integer>{

    List<Compra> findByIdClienteOrderByIdProductoAsc(int idCliente);
    List<Compra> findByFecha(LocalDateTime fecha);
    List<Compra> findByFechaAndIdClienteOrderByIdClienteAsc(LocalDateTime fecha, int idCliente);
    List<Compra> findByFechaAndAndIdClienteAndMedioPagoOrderByFechaAsc(LocalDateTime fecha, int idCliente, String medioPago);

}
