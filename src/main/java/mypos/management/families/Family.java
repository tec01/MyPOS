package mypos.management.families;

import mypos.management.products.Product;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.List;

@Entity
public class Family {

    @Id
    private Integer id;
    private String name;
    private List<Product> products;

}
