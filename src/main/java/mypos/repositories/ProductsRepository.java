package mypos.repositories;

import mypos.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ProductsRepository extends JpaRepository<Product, Integer>, QuerydslPredicateExecutor {

    Optional<Product> findByName(String name);

}
