package mypos.repositories;

import mypos.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

    Optional<Employee> findByName(String name);
    Optional<Employee> findByPhoneNumber(String phoneNumber);

}
