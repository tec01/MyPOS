package mypos.management.orders;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Allergen {

    @Id
    @GeneratedValue
    private int id;
    @Column(nullable = false)
    private String detail;
}
