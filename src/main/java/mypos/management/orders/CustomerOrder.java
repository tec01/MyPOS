package mypos.management.orders;

import mypos.management.employees.Employee;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

import static javax.persistence.CascadeType.ALL;

@Entity
@Table(name = "CUSTOMER_ORDERS")
public class CustomerOrder {

    @Id
    @Column(name = "ORDER_ID", nullable = false)
    @GeneratedValue (strategy = GenerationType.AUTO)
    private Integer id;
    @OneToMany ( mappedBy = "customerOrder", cascade = ALL )
    private List<OrderItem> items;
    @Column ( name = "DATE_REGISTERED")
    private LocalDateTime dateRegistered;
    @Column ( name = "DATE_DELIVERY")
    private LocalDateTime dateDelivery;
    @ManyToOne
    @JoinColumn( name = "EMPLOYEE_ID")
    private Employee employee;

    public CustomerOrder(){

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public List<OrderItem> getItems() {
        return items;
    }

    public void setItems(List<OrderItem> items) {
        this.items = items;
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

    public LocalDateTime getDateDelivery() {
        return dateDelivery;
    }

    public void setDateDelivery(LocalDateTime dateDelivery) {
        this.dateDelivery = dateDelivery;
    }

}
