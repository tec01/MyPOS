package mypos.services;


import mypos.model.CustomerOrder;
import mypos.repositories.OrdersRepository;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class OrdersService {

    private OrdersRepository repository;

    OrdersService(OrdersRepository repository){
        this.repository = repository;
    }

    public List<CustomerOrder> getAll(){
        return repository.findAll();
    }


}
