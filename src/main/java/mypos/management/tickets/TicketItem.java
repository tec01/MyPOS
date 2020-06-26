package mypos.management.tickets;

import mypos.commons.Discount;
import mypos.management.products.Product;

import java.math.BigDecimal;

public class TicketItem {

    private int id;
    private Product product;
    private int quantity;
    private Discount discount;
    private BigDecimal subTotal;

    public TicketItem(int id, Product product, int quantity){
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

    public Discount getDiscount() {
        return discount;
    }

    public void setDiscount(Discount discount) {
        this.discount = discount;
    }


}
