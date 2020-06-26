package mypos.management.tickets;

import mypos.commons.Discount;
import mypos.commons.PaymentMethod;
import mypos.management.employees.Employee;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

@Entity
public class Ticket {

    @Id
    @GeneratedValue
    private int id;
    @Enumerated(EnumType.STRING)
    private PaymentMethod payMethod;
    @Column(nullable = false)
    private BigDecimal total;
    @OneToOne
    private Discount discount;
    @Column
    private BigDecimal totalCash;
    @Column
    private BigDecimal totalCard;
    @Column
    private BigDecimal change;
    @Column
    private LocalDateTime date;
    @OneToOne
    private Employee employee;
    @Column(nullable = false)
    private boolean delivered;
    @OneToMany
    private List<Item> itemList;

    public Ticket(int id, PaymentMethod payMethod,
                  BigDecimal total, Discount discount, BigDecimal totalCash, BigDecimal totalCard, BigDecimal change,
                  LocalDateTime date, Employee employee, boolean delivered, List<Item> itemList) {
        this.id = id;
        this.payMethod = payMethod;
        this.total = total;
        this.totalCash = totalCash;
        this.totalCard = totalCard;
        this.change = change;
        this.discount= discount;
        this.date = date;
        this.employee = employee;
        this.delivered = delivered;
        this.itemList = itemList;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public PaymentMethod getPayMethod() {
        return payMethod;
    }

    public void setPayMethod(PaymentMethod payMethod) {
        this.payMethod = payMethod;
    }

    public BigDecimal getTotal() {
        return total;
    }

    public void setTotal(BigDecimal total) {
        this.total = total;
    }

    public BigDecimal getTotalCash() {
        return totalCash;
    }

    public void setTotalCash(BigDecimal totalCash) {
        this.totalCash = totalCash;
    }

    public BigDecimal getTotalCard() {
        return totalCard;
    }

    public void setTotalCard(BigDecimal totalCard) {
        this.totalCard = totalCard;
    }

    public BigDecimal getChange() {
        return change;
    }

    public void setChange(BigDecimal change) {
        this.change = change;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public boolean isDelivered() {
        return delivered;
    }

    public void setDelivered(boolean delivered) {
        this.delivered = delivered;
    }

    public List<Item> getItemList() {
        return itemList;
    }

    public void setItemList(List<Item> itemList) {
        this.itemList = itemList;
    }

    public Discount getDiscount() {
        return discount;
    }

    public void setDiscount(Discount discount) {
        this.discount = discount;
    }
    
}
