package mypos.repositories;

import mypos.model.Allergen;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AllergensRepository extends JpaRepository<Allergen, Integer> {

}
