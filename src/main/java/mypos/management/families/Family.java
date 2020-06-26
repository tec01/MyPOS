package mypos.management.families;

import mypos.management.products.Product;

import javax.persistence.*;
import java.util.List;

@Entity
public class Family {

    @Id
    @GeneratedValue
    private int id;
    @Column(nullable = false)
    private String name;
    @Column
    @OneToMany(targetEntity= Product.class, mappedBy="id", fetch= FetchType.EAGER)
    private List<Product> products;

}
