package mypos.management.families;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

;


interface FamiliesRepository extends JpaRepository<Family, Integer>{

    Optional<Family> findByName(String name);
    Optional<Family> findById(Integer id);

}
