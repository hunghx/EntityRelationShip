package ra.academy.service;

import ra.academy.dto.ProductRequest;
import ra.academy.model.Product;

import java.util.List;

public interface IProductService {
    List<Product> findAll();
    Product findById(Long id);
    void save(ProductRequest productRequest);
    void update(Product product);
    void deleteById(Long id);
}
