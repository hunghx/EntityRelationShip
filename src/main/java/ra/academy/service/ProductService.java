package ra.academy.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ra.academy.dto.ProductRequest;
import ra.academy.model.Catalog;
import ra.academy.model.Product;
import ra.academy.repository.ICatalogRepository;
import ra.academy.repository.IProductRepository;

import java.util.List;
@Service
public class ProductService implements IProductService{
    @Autowired
    private IProductRepository productRepository;
    @Autowired
    private ICatalogRepository catalogRepository;
    @Override
    public List<Product> findAll() {
        return productRepository.findAll();
    }

    @Override
    public Product findById(Long id) {
        return productRepository.findById(id).orElse(null);
    }

    @Override
    public void save(ProductRequest productRequest) {
        Product p = new Product();
        p.setName(productRequest.getName());
        p.setDescription(productRequest.getDescription());
        p.setPrice(productRequest.getPrice());
        p.setStock(productRequest.getStock());
        Catalog cat = catalogRepository.findById(productRequest.getCatalogId()).orElse(null); // có id là id được gửi lên từ form
//        cat.setId(productRequest.getCatalogId());
        p.setCatalog(cat);
        productRepository.save(p);
    }

    @Override
    public void update(Product product) {
        productRepository.save(product);
    }

    @Override
    public void deleteById(Long id) {
        productRepository.deleteById(id);
    }
}
