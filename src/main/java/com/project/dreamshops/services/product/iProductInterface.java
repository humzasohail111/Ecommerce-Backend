package com.project.dreamshops.services.product;

import com.project.dreamshops.model.Product;

import java.util.List;

public interface iProductInterface {
    Product addProduct(Product product);
    Product getProductById(Long id);
    void deleteProductById(Long id);
    void updateProduct(Product product, Long productId);
    List<Product> getAllProducts();
    List<Product> getProductsByCategory(Long category);
    List<Product> getProductsByBrand(String brand);
    List<Product> getProductByCategoryAndBrand(String category, String brand);
    List<Product> getProductsByName(String name);
    List<Product> getProductsByBrandAndName(String name, String brand);
    Long countProductByBrandAndName(String brand, String name);
}
