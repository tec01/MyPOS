package mypos.repositories;

import mypos.model.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

@Repository
public interface TicketsRepository extends JpaRepository<Ticket, Long> {

    List<Ticket> findByDateRegisteredBetween(LocalDateTime from, LocalDateTime to);
    List<Ticket> findByTotalBetween(BigDecimal from, BigDecimal to);

}
