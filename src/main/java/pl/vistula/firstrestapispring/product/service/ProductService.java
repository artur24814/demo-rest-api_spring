package pl.vistula.firstrestapispring.product.service;

import org.springframework.stereotype.Service;

import pl.vistula.firstrestapispring.product.api.request.ProductRequest;
import pl.vistula.firstrestapispring.product.api.response.ProductResponse;
import pl.vistula.firstrestapispring.product.domain.Product;
import pl.vistula.firstrestapispring.product.repository.ProductRepository;
import pl.vistula.firstrestapispring.product.support.ProductExceptionSupplier;
import pl.vistula.firstrestapispring.product.support.ProductMapper;

import javax.management.RuntimeErrorException;

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

    public ProductResponse find(Long id){
        Product product = productRepository.findById(id).orElseThrow(ProductExceptionSupplier.productNotFound(id));
        return productMapper.toProductResponse(product);
    }
}
