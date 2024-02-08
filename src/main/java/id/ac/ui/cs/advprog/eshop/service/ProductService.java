package id.ac.ui.cs.advprog.eshop.service;

import id.ac.ui.cs.advprog.eshop.model.Product;
import java.util.List;
import java.util.Optional;

public interface ProductService {
    Product createOrUpdate(Product product);
    Optional<Product> findById(String id);
    void deleteById(String id);
    List<Product> findAll();
}
