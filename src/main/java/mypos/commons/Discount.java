package mypos.commons;

import java.math.BigDecimal;

public class Discount {

    private int id;
    private DiscountType type;
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
