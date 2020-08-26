package mypos.repositories;

import mypos.model.Customer;
import mypos.model.Employee;
import mypos.model.Invoice;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Repository
public interface InvoicesRepository extends JpaRepository<Invoice, Integer> {

    Optional<Invoice> findById(Integer integer);
    List<Invoice> findByCustomer(Customer customer);
    List<Invoice> findByEmployee(Employee employee);
    List<Invoice> findByDateRegisteredBetween(LocalDateTime from, LocalDateTime to);
}

