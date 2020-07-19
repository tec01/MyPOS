package mypos.management.invoices;

import mypos.management.customer.Customer;
import mypos.management.employees.Employee;
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
