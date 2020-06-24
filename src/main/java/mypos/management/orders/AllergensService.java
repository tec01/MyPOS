package mypos.management.orders;

import java.util.List;

public class AllergensService {

    private AllergensRepository repository;

    AllergensService(AllergensRepository repository){
        this.repository = repository;

    }

    public List<Allergen> getAll(){
        return repository.findAll();
    }


}
