package mypos.services;

import mypos.model.Ingredient;
import mypos.repositories.IngredientsRepository;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class IngredientsService {

    private IngredientsRepository repository;

    IngredientsService(IngredientsRepository repository){
        this.repository= repository;
    }

    public List<Ingredient> getAll(){
        return repository.findAll();
    }


   
}
