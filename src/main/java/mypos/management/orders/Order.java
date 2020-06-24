package mypos.management.orders;

import javafx.util.Pair;
import mypos.management.employees.Employee;
import mypos.management.products.Ingredient;
import mypos.management.products.Product;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.LocalDateTime;
import java.util.List;

@Entity
public class Order {

    @Id
    private int id;
    @Column
    private List<Pair<Product,Ingredient>> items;
    @Column
    private List<Allergen> allergens;
    @Column
    private LocalDateTime dateTime;
    @Column
    private Employee employee;


}
