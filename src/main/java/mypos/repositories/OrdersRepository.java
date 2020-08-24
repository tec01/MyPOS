package mypos.repositories;

import mypos.model.CustomerOrder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface OrdersRepository extends JpaRepository<CustomerOrder, Integer>{

    Optional<CustomerOrder> findById(Integer id);

}
