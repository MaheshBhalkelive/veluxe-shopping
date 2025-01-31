package com.ecommerce.Veluxe.service;

import com.ecommerce.Veluxe.model.Product;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ProductService {
    public List<Product> getAllProducts();

    public Product addProduct(Product product);
}
