package mypos.management.tickets;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;


import mypos.commons.Discount;

public class Ticket {

    private String id;
    private String payMethod;
    private String employeeName;
    private BigDecimal total;
    private Discount discount;
    private BigDecimal totalCash;
    private BigDecimal totalCard;
    private BigDecimal change;
    private LocalDateTime date;
    private int employeeId;
    private boolean delivered;
    private List<Item> itemList;

    public Ticket(String id, String payMethod, String employeeName, String discountType,
                  BigDecimal total, BigDecimal discount, BigDecimal totalCash, BigDecimal totalCard, BigDecimal change,
                  LocalDateTime date, int employeeId, boolean delivered, List<Item> itemList) {
        this.id = id;
        this.payMethod = payMethod;
        this.employeeName = employeeName;
        this.total = total;
        this.totalCash = totalCash;
        this.totalCard = totalCard;
        this.change = change;
        this.date = date;
        this.employeeId = employeeId;
        this.delivered = delivered;
        this.itemList = itemList;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPayMethod() {
        return payMethod;
    }

    public void setPayMethod(String payMethod) {
        this.payMethod = payMethod;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
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

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
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
