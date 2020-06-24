package mypos.management.invoices;

import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class InvoicesService {

    private InvoicesRepository repository;

    InvoicesService(InvoicesRepository repository){
        this.repository = repository;
    }

    public Optional<Invoice> getInvoice(int id){
        return repository.findById(id);
    }

    
  
}
