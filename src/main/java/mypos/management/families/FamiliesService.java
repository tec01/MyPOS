package mypos.management.families;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class FamiliesService {

    private FamiliesRepository repository;

    FamiliesService(FamiliesRepository repository){
        this.repository=repository;
    }

    public List<Family> getAll(){
        return repository.findAll();
    }
    public Optional<Family> getFamily(int id){
        return repository.findById(id);
    }
    public Optional<Family> getFamily(String name){
        return repository.findByName(name);
    }


}
