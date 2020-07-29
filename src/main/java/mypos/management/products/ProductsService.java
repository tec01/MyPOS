package mypos.management.products;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class ProductsService {

    private ProductsRepository repository;

    ProductsService(ProductsRepository repository){
        this.repository = repository;
    }

    public Optional<Product> getProduct(int id){
        return repository.findById(id);
    }

    public List<Product> getAll(){
        return repository.findAll();
    }




}
