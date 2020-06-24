package mypos.management.invoices;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;

import java.util.Optional;

public interface InvoicesRepository extends JpaRepository<Invoice, Integer>, QuerydslPredicateExecutor<Invoice> {

    Optional<Invoice> findById(Integer integer);
}
