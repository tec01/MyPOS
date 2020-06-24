package mypos.management.orders;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;

import java.util.Optional;

public interface OrdersRepository extends JpaRepository<Order, Integer>, QuerydslPredicateExecutor<Order> {

    Optional<Order> findById(Integer id);

}
