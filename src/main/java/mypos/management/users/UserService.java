package mypos.management.users;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    private UsersRepository repository;

    UserService(UsersRepository repository){
        this.repository = repository;
    }

    public List<User> getAll(){
        return repository.findAll();
    }
}
