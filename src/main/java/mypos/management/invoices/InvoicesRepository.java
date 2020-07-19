package mypos.management.invoices;

import mypos.management.customer.Customer;
import mypos.management.employees.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

public interface InvoicesRepository extends JpaRepository<Invoice, Integer> {

    Optional<Invoice> findById(Integer integer);
    List<Invoice> findByCustomer(Customer customer);
    List<Invoice> findByEmployee(Employee employee);
    List<Invoice> findByDateRegisteredBetween(LocalDateTime from, LocalDateTime to);
}

