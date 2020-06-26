package mypos.management.orders;

import mypos.management.products.Ingredient;
import mypos.management.products.Product;

import java.util.List;

public class OrderItem {

    private int id;
    private Product product;
    private List<Ingredient> ingredients;
    private List<Allergen> allergens;
    private List<OrderOption> options;
}
