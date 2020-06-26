package mypos.management.invoices;

import mypos.commons.Discount;
import mypos.commons.PaymentMethod;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Invoice {

    private int id;
    private String client;
    private LocalDateTime dateTime;
    private BigDecimal total;
    private PaymentMethod paymentMethod;
    private Discount discount;
    private String path;

}
