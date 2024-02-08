package id.ac.ui.cs.advprog.eshop.repository;

import id.ac.ui.cs.advprog.eshop.model.Product;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Repository
public class ProductRepository {
    private List<Product> productData = new ArrayList<>();

    public Product createOrUpdate(Product product) {
        if (product.getProductid() == null || product.getProductid().isEmpty()) {
            // Assign a new unique ID for new product
            product.setProductid(UUID.randomUUID().toString());
            productData.add(product);
        } else {
            // Update existing product
            for (Product existingProduct : productData) {
                if (existingProduct.getProductid().equals(product.getProductid())) {
                    existingProduct.setProductName(product.getProductName());
                    existingProduct.setProductQuantity(product.getProductQuantity());
                    return existingProduct;
                }
            }
        }
        return product;
    }

    public Optional<Product> findById(String id) {
        for (Product product : productData) {
            if (product.getProductid().equals(id)) {
                return Optional.of(product);
            }
        }
        return Optional.empty();
    }

    public boolean deleteById(String id) {
        return productData.removeIf(product -> product.getProductid().equals(id));
    }

    public Iterator<Product> findAll() {
        return productData.iterator();
    }
}
