package mypos.management.tickets;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

public interface TicketsRepository extends JpaRepository<Ticket, Long>, QuerydslPredicateExecutor<Ticket> {

    Optional<List<Ticket>> findByDateBetween(LocalDateTime from, LocalDateTime to);
    Optional<List<Ticket>> findByTotalBetween(BigDecimal from, BigDecimal to);

}
