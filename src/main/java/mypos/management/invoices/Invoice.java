package mypos.management.invoices;

import mypos.commons.Discount;
import mypos.commons.PaymentMethod;
import mypos.management.employees.Employee;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name = "INVOICES")
public class Invoice {

    @Id
    @Column(name = "INVOICE_ID", nullable = false)
    @GeneratedValue (strategy = GenerationType.AUTO)
    private Integer id;
    @Column( name = "NIF", nullable = false)
    private String customer;
    @Column( name = "DATE_REGISTERED", nullable = false)
    private LocalDateTime dateRegistered;
    @Column( name = "TOTAL", nullable = false)
    private BigDecimal total;
    @Column( name = "PAYMENT_METHOD", nullable = false)
    @Enumerated(EnumType.STRING)
    private PaymentMethod paymentMethod;
    @OneToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="DISCOUNT_ID")
    private Discount discount;
    @Column( name = "FILE_PATH",  nullable = false)
    private String path;
    @ManyToOne
    @JoinColumn (name = "employee_id")
    private Employee employee;

    public Invoice(){

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    public LocalDateTime getDateRegistered() {
        return dateRegistered;
    }

    public void setDateRegistered(LocalDateTime dateRegistered) {
        this.dateRegistered = dateRegistered;
    }

    public BigDecimal getTotal() {
        return total;
    }

    public void setTotal(BigDecimal total) {
        this.total = total;
    }

    public PaymentMethod getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(PaymentMethod paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public Discount getDiscount() {
        return discount;
    }

    public void setDiscount(Discount discount) {
        this.discount = discount;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }
}
