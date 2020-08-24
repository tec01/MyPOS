package mypos.repositories;

import mypos.model.Family;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface FamiliesRepository extends JpaRepository<Family, Integer>{

    Optional<Family> findByName(String name);
    Optional<Family> findById(Integer id);

}
