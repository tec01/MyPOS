package mypos.services;

import mypos.model.Customer;
import mypos.model.Employee;
import mypos.model.Invoice;
import mypos.repositories.InvoicesRepository;
import org.springframework.stereotype.Service;

import java.util.List;
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

    public List<Invoice> getByCustomer(Customer customer){
        return repository.findByCustomer(customer);
    }

    public List<Invoice> getByEmployee(Employee employee){

        return repository.findByEmployee(employee);
    }
    
  
}
