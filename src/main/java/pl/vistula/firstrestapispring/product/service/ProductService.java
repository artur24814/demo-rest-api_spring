package pl.vistula.firstrestapispring.product.service;

import org.springframework.stereotype.Service;

import pl.vistula.firstrestapispring.product.api.request.ProductRequest;
import pl.vistula.firstrestapispring.product.api.response.ProductResponse;
import pl.vistula.firstrestapispring.product.domain.Product;
import pl.vistula.firstrestapispring.product.repository.ProductRepository;
import pl.vistula.firstrestapispring.product.support.ProductMapper;

@Service
public class ProductService {
    private final ProductRepository productRepository;
    private final ProductMapper productMapper;

    public ProductService(ProductRepository productRepository, ProductMapper productMapper) {
        this.productRepository = productRepository;
        this.productMapper = productMapper;
    }

    public ProductResponse create(ProductRequest productRequest) {
        Product product = productRepository.save(productMapper.toProduct(productRequest));
        return productMapper.toProductResponse(product);
    }
}
