package mypos.management.products;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;

public interface ProductsRepository extends JpaRepository<Product, Integer>, QuerydslPredicateExecutor<Product> {


}
