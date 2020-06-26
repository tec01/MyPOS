package mypos.management.orders;

import mypos.management.products.Ingredient;
import mypos.management.products.Product;

import java.util.List;

@Entity
public class OrderItem {

    @Id
    @GeneratedValue
    private int id;
    @OneToOne
    private Product product;
    @Column
    @OneToMany
    private List<Ingredient> ingredients;
    @Column
    @OneToMany
    private List<Allergen> allergens;
    @Column
    @OneToMany
    private List<OrderOption> options;
}
