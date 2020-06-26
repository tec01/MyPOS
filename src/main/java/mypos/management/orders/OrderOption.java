package mypos.management.orders;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class OrderOption {

    @Id
    @GeneratedValue
    private int id;
    @Column
    private String description;
}
