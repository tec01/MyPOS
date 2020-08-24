package mypos.services;

import mypos.model.Customer;
import mypos.repositories.CustomerRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CustomerService {

    private CustomerRepository customerRepository;

    CustomerService(CustomerRepository repository){
        this.customerRepository=repository;
    }

    public List<Customer> getAll(){
        return this.customerRepository.findAll();
    }

    public Optional<Customer> getByName(String name){
        return this.customerRepository.findByName(name);
    }

    public Optional<Customer> getByPhoneNumber(String number){
        return this.customerRepository.findByPhoneNumber(number);
    }


}
