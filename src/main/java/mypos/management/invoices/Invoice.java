package mypos.management.invoices;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Invoice {

    @Id
    @GeneratedValue
    private int id;
    @Column(nullable = false)
    private String path;

}
