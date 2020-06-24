package mypos.management.families;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;

import java.util.Optional;

;


interface FamiliesRepository extends JpaRepository<Family, Integer>, QuerydslPredicateExecutor<Family> {

    Optional<Family> findByName(String name);
    Optional<Family> findById(Integer id);

}
