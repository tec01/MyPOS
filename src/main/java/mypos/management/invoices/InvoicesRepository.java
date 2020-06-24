package mypos.management.invoices;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface InvoicesRepository extends JpaRepository<Invoice, Integer> {

    Optional<Invoice> findById(Integer integer);
}
