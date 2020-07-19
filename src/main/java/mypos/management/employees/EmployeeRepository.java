package mypos.management.employees;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

    Optional<Employee> findByName(String name);
    Optional<Employee> findByPhoneNumber(String phoneNumber);

}
