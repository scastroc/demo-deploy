package cl.sebacastro.producto.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import cl.sebacastro.producto.model.Producto;

public interface IProductoRepository extends JpaRepository<Producto, Integer> {

}
