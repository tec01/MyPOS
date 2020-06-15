package mypos.commons;

import java.math.BigDecimal;

public class Discount {
    public enum TYPE {PERCENT, CASH}
    private BigDecimal amount;
    private TYPE type;
    
    
    
    public Discount(BigDecimal amount, TYPE type) {
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
    public TYPE getType() {
        return type;
    }
    public void setType(TYPE type) {
        this.type = type;
    }
    
    
}
