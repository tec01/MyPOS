package mypos.management.tickets;

import java.math.BigDecimal;

import mypos.commons.Discount;
import mypos.management.products.Product;

public class Item {
    private Product product;
    private int quantity;
    private Discount discount;
    private BigDecimal subTotal;

    public Item(Product product, int quantity){
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

    public Discount getDiscount() {
        return discount;
    }

    public void setDiscount(Discount discount) {
        this.discount = discount;
    }
    
    
}
