package mypos.management.reports;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Report {
    @Id
    @GeneratedValue
    private Integer id;
    @Column(nullable = false)
    private String path;

}
