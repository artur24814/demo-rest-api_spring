package pl.vistula.firstrestapispring.product.api;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import io.swagger.v3.oas.annotations.Operation;

import pl.vistula.firstrestapispring.product.api.request.ProductRequest;
import pl.vistula.firstrestapispring.product.api.request.UpdateProductRequest;
import pl.vistula.firstrestapispring.product.api.response.ProductResponse;
import pl.vistula.firstrestapispring.product.service.ProductService;

import java.util.List;


@RestController
@RequestMapping("api/v1/products")
public class ProductController {
    private final ProductService productService;
    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping
    @Operation(summary = "Get All Products")
    public ResponseEntity<List<ProductResponse>> findAll(){
        List<ProductResponse> productResponses = productService.findAll();
        return ResponseEntity.status(HttpStatus.OK).body(productResponses);
    }

    @PostMapping
    @Operation(summary = "Create Product")
    public ResponseEntity<ProductResponse> create(@RequestBody ProductRequest productRequest){
        ProductResponse productResponse = productService.create(productRequest);
        return new ResponseEntity<>(productResponse, HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    @Operation(summary = "Find Product by ID")
    public ResponseEntity<ProductResponse> find(@PathVariable Long id){
        ProductResponse productResponse = productService.find(id);
        return ResponseEntity.status(HttpStatus.OK).body(productResponse);
    }

    @PutMapping("/{id}")
    @Operation(summary = "Update Product")
    public ResponseEntity<ProductResponse> update(@PathVariable Long id, @RequestBody UpdateProductRequest updateProductRequest) {
        ProductResponse productResponse = productService.update(id, updateProductRequest);
        return ResponseEntity.status(HttpStatus.OK).body(productResponse);
    }

    @DeleteMapping("/{id}")
    @Operation(summary = "Delete Product")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        productService.delete(id);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }
}
