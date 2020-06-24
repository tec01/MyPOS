package mypos.management.orders;

import javafx.util.Pair;
import mypos.management.employees.Employee;
import mypos.management.products.Ingredient;
import mypos.management.products.Product;

import java.time.LocalDateTime;
import java.util.List;

public class Order {

    private int id;
    private List<Pair<Product,Ingredient>> items;
    private List<Allergen> allergens;
    private LocalDateTime dateTime;
    private Employee employee;


}
