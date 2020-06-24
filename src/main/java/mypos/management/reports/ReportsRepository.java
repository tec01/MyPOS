package mypos.management.reports;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;

public interface ReportsRepository extends JpaRepository<Report, Integer>, QuerydslPredicateExecutor<Report> {

}
