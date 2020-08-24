package mypos.services;

import mypos.model.Employee;
import mypos.repositories.EmployeeRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {

    private EmployeeRepository employeeRepository;

    EmployeeService(EmployeeRepository employeeRepository){
        this.employeeRepository = employeeRepository;
    }

    public List<Employee> getAll(){
        return employeeRepository.findAll();
    }

    public Optional<Employee> getByName(String name){
        return employeeRepository.findByName(name);
    }

    public Optional<Employee> getByPhoneNumber(String phoneNumber){
        return employeeRepository.findByPhoneNumber(phoneNumber);
    }

}
