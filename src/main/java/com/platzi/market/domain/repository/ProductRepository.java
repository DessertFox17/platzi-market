package com.platzi.market.domain.repository;

import com.platzi.market.domain.Product;
import com.platzi.market.persistence.entity.Producto;

import java.util.List;
import java.util.Optional;

public interface ProductRepository {

    List<Product> getAll();
    Optional<Product> getProduct(int productId);
    Product save(Product product);
    void delete(int productId);


    Optional<List<Product>> getByCategory(int categoryId);
    Optional<List<Product>> getScarseProducts(int stock, boolean active);
    Optional<List<Product>> getCheapperProducts(int price, int categoryId);
}
