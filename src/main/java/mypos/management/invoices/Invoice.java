package mypos.management.invoices;

import mypos.commons.Discount;
import mypos.commons.PaymentMethod;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
public class Invoice {

    @Id
    @GeneratedValue
    private int id;
    @Column(nullable = false)
    private String client;
    @Column(nullable = false)
    private LocalDateTime dateTime;
    @Column(nullable = false)
    private BigDecimal total;
    @Column(nullable = false)
    private PaymentMethod paymentMethod;
    @Column
    private Discount discount;
    @Column(nullable = false)
    private String path;

}
