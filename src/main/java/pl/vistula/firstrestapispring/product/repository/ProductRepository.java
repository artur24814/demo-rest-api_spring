package pl.vistula.firstrestapispring.product.repository;

import org.springframework.stereotype.Repository;
import pl.vistula.firstrestapispring.product.domain.Product;

import java.util.HashMap;
import java.util.Map;

@Repository
public class ProductRepository {
    protected final HashMap<Long, Product> map = new HashMap<>();
    protected long counter = 1;

    public Product save(Product entity){
        setId(entity);
        return entity;
    }

    private Product setId(Product entity) {
        entity.setId(counter);
        map.put(counter, entity);
        counter ++;
        return entity;
    }
}
