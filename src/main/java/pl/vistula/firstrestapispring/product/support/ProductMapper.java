package pl.vistula.firstrestapispring.product.support;

import org.springframework.stereotype.Component;

import pl.vistula.firstrestapispring.product.api.request.ProductRequest;
import pl.vistula.firstrestapispring.product.api.response.ProductResponse;
import pl.vistula.firstrestapispring.product.domain.Product;

@Component
public class ProductMapper {

    public Product toProduct (ProductRequest productRequest){
        return new Product(productRequest.getName());
    }

    public Product toProduct (Product product, ProductRequest productRequest){
        product.setName(productRequest.getName());
        return new Product(productRequest.getName());
    }

    public ProductResponse toProductResponse (Product product){
        return new ProductResponse(product.getId(), product.getName());
    }
}
