package mypos.management.tickets;

import mypos.commons.Discount;
import mypos.commons.PaymentMethod;
import mypos.management.employees.Employee;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "TICKETS")
public class Ticket {

    @Id
    @Column(name = "TICKET_ID", nullable = false)
    @GeneratedValue (strategy = GenerationType.AUTO)
    private Integer ticketId;
    @Column (nullable = false)
    @Enumerated(EnumType.STRING)
    private PaymentMethod payMethod;
    @Column( name = "TOTAL", nullable = false)
    private BigDecimal total;
    @OneToOne
    @JoinColumn(name="DISCOUNT_ID")
    private Discount discount;
    @Column (name="TOTAL_CASH", precision = 2, scale = 2, nullable = false)
    private BigDecimal totalCash;
    @Column (name="TOTAL_CARD", precision = 2, scale = 2, nullable = false)
    private BigDecimal totalCard;
    @Column (name="TOTAL_RETURN", precision = 2, scale = 2 )
    private BigDecimal totalReturn ;
    @Column (name="DATE_REGISTERED", precision = 2, scale = 2, nullable = false )
    private LocalDateTime dateRegistered;
    @ManyToOne
    @JoinColumn (name = "EMPLOYEE_ID", nullable = false)
    private Employee employee;
    @Column(nullable = false)
    private boolean delivered;
    @OneToMany (mappedBy = "ticket")
    private List<TicketItem> itemList;

    public Ticket(){

    }

    public Ticket(int ticketId, PaymentMethod payMethod,
                  BigDecimal total, Discount discount, BigDecimal totalCash, BigDecimal totalCard, BigDecimal totalReturn,
                  LocalDateTime dateRegistered, Employee employee, boolean delivered, List<TicketItem> itemList) {
        this.ticketId = ticketId;
        this.payMethod = payMethod;
        this.total = total;
        this.totalCash = totalCash;
        this.totalCard = totalCard;
        this.totalReturn = totalReturn;
        this.discount= discount;
        this.dateRegistered = dateRegistered;
        this.employee = employee;
        this.delivered = delivered;
        this.itemList = itemList;
    }

    public int getId() {
        return ticketId;
    }

    public void setId(int id) {
        this.ticketId = id;
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

    public BigDecimal getTotalReturn() {
        return totalReturn;
    }

    public void setTotalReturn(BigDecimal totalReturn) {
        this.totalReturn = totalReturn;
    }

    public LocalDateTime getDateRegistered() {
        return dateRegistered;
    }

    public void setDateRegistered(LocalDateTime dateRegistered) {
        this.dateRegistered = dateRegistered;
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
