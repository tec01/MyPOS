package mypos.model;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "TICKET_ITEMS")
public class TicketItem {

    @Id
    @Column(name = "TICKET_ITEM_ID", nullable = false)
    @GeneratedValue (strategy = GenerationType.AUTO)
    private Integer ticketItemId;
    @OneToOne
    @JoinColumn(name = "PRODUCT_ID",nullable = false)
    private Product product;
    @Column (name = "QUANTITY", nullable = false)
    private Float quantity;
    @OneToOne(optional = true)
    @JoinColumn (name = "DISCOUNT_ID")
    private Discount discount;
    @Column (name="SUBTOTAL", precision = 2, scale = 2 , nullable = false)
    private BigDecimal subTotal;
    @ManyToOne
    @JoinColumn(name = "TICKET_ID", nullable = false)
    private Ticket ticket;

    public TicketItem(){
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Float getQuantity() {
        return quantity;
    }

    public void setQuantity(Float quantity) {
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


    public Integer getId() {
        return ticketItemId;
    }

    public void setId(Integer id) {
        this.ticketItemId = id;
    }
}
