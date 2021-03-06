package mypos.services;

import mypos.model.Ticket;
import mypos.repositories.TicketsRepository;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Service
public class TicketsService {

    private TicketsRepository repository;

    TicketsService(TicketsRepository repository){
        this.repository = repository;
    }

    public Optional<Ticket> getTicket(long id){
        return repository.findById(id);
    }

    public List<Ticket> getAll(){
        return repository.findAll();
    }

    public List<Ticket> getTicketsByDate(LocalDateTime from , LocalDateTime to){
        return repository.findByDateRegisteredBetween(from,to);
    }

    public List<Ticket> getTicketsByTotal(BigDecimal from , BigDecimal to){
        return repository.findByTotalBetween(from,to);
    }
     
}
