package mypos.management.tickets;

import mypos.commons.Discount;
import mypos.management.products.Product;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.util.Optional;

@Entity
public class Item {

    @Id
    private int id;
    @Column
    private Product product;
    @Column
    private int quantity;
    @Column
    private Optional<Discount> discount;
    @Column
    private BigDecimal subTotal;

    public Item(int id, Product product, int quantity){
        this.id = id;
        this.product= product;
        this.quantity=quantity;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public BigDecimal getSubTotal() {
        return subTotal;
    }

    public void setSubTotal(BigDecimal subTotal) {
        this.subTotal = subTotal;
    }

    public Optional<Discount> getDiscount() {
        return discount;
    }

    public void setDiscount(Discount discount) {
        this.discount = Optional.ofNullable(discount);
    }
    
    
}
