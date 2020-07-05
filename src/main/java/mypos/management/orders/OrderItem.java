package mypos.management.orders;

import mypos.management.products.Ingredient;
import mypos.management.products.Product;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "ORDER_ITEMS")
public class OrderItem {

    @Id
    @Column(name = "ORDER_ITEM_ID", nullable = false)
    @GeneratedValue (strategy = GenerationType.AUTO)
    private Integer orderItemId;
    @ManyToOne
    @JoinColumn(name="ORDER_ID", nullable=false)
    private CustomerOrder customerOrder;
    @OneToOne
    @JoinColumn(name="PRODUCT_ID", nullable=false)
    private Product product;
    @OneToMany
    private Set<Ingredient> ingredients;
    @OneToMany
    private Set<Allergen> allergens;
    @OneToMany
    private Set<OrderOption> orderOptions;

    public OrderItem(){

    }

    public Integer getOrderItemId() {
        return orderItemId;
    }

    public void setOrderItemId(Integer orderItemId) {
        this.orderItemId = orderItemId;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Set<Ingredient> getIngredients() {
        return ingredients;
    }

    public void setIngredients(Set<Ingredient> ingredients) {
        this.ingredients = ingredients;
    }

    public Set getAllergens() {
        return allergens;
    }

    public void setAllergens(Set allergens) {
        this.allergens = allergens;
    }

    public Set<OrderOption> getOrderOptions() {
        return orderOptions;
    }

    public void setOrderOptions(Set<OrderOption> orderOptions) {
        this.orderOptions = orderOptions;
    }

    public CustomerOrder getCustomerOrder() {
        return customerOrder;
    }

    public void setCustomerOrder(CustomerOrder customerOrder) {
        this.customerOrder = customerOrder;
    }
}
