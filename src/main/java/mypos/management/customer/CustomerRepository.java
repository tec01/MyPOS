package mypos.management.customer;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CustomerRepository  extends JpaRepository<Customer, Integer> {

    Optional<Customer> findByName(String name);
    Optional<Customer> findByPhoneNumber(String phoneNumber);
}
