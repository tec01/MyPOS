package mypos.commons;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
public class Discount {

    @Id
    @GeneratedValue
    private int id;
    @Enumerated(EnumType.STRING)
    private DiscountType type;
    @Column
    private BigDecimal amount;

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

}
