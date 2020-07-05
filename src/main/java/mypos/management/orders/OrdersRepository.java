package mypos.management.orders;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface OrdersRepository extends JpaRepository<CustomerOrder, Integer>{

    Optional<CustomerOrder> findById(Integer id);

}
