package mypos.model;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table (name = "DISCOUNTS")
public class Discount {

    @Id
    @Column(name = "DISCOUNT_ID", nullable = false)
    @GeneratedValue (strategy = GenerationType.AUTO)
    private Integer id;
    @Enumerated(EnumType.STRING)
    private DiscountType type;
    @Column( name = "AMOUNT", nullable = false)
    private BigDecimal amount;

    public Discount(){

    }

    public Discount(BigDecimal amount, DiscountType type) {
        super();
        this.amount = amount;
        this.type = type;
    }
    public BigDecimal getAmount() {
        return amount;
    }
    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }
    public DiscountType getType() {
        return type;
    }
    public void setType(DiscountType type) {
        this.type = type;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
