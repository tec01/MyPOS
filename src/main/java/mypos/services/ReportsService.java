package mypos.services;

import mypos.repositories.ReportsRepository;
import org.springframework.stereotype.Service;

@Service
public class ReportsService {

    private ReportsRepository repository;

    ReportsService(ReportsRepository repository){
        this.repository = repository;
    }

}
