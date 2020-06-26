package mypos.management.tickets;

import mypos.commons.Discount;
import mypos.commons.PaymentMethod;
import mypos.management.employees.Employee;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

public class Ticket {

    private int id;
    private PaymentMethod payMethod;
    private BigDecimal total;
    private Discount discount;
    private BigDecimal totalCash;
    private BigDecimal totalCard;
    private BigDecimal change;
    private LocalDateTime date;
    private Employee employee;
    private boolean delivered;
    private List<TicketItem> itemList;

    public Ticket(int id, PaymentMethod payMethod,
                  BigDecimal total, Discount discount, BigDecimal totalCash, BigDecimal totalCard, BigDecimal change,
                  LocalDateTime date, Employee employee, boolean delivered, List<TicketItem> itemList) {
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

    public List<TicketItem> getItemList() {
        return itemList;
    }

    public void setItemList(List<TicketItem> itemList) {
        this.itemList = itemList;
    }

    public Discount getDiscount() {
        return discount;
    }

    public void setDiscount(Discount discount) {
        this.discount = discount;
    }

}
