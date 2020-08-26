package mypos.services;

import mypos.model.Allergen;
import mypos.repositories.AllergensRepository;

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
