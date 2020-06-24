package mypos.management.products;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;

public interface IngredientsRepository extends JpaRepository<Ingredient, Integer>, QuerydslPredicateExecutor<Ingredient> {

}
