package mypos.management.orders;

import mypos.management.employees.Employee;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Entity
public class Order {

    @Id
    @GeneratedValue
    private int id;
    @Column
    @OneToMany(targetEntity=OrderItem.class, mappedBy="id", fetch=FetchType.EAGER)
    private List<OrderItem> items;
    @Column
    private LocalDateTime dateTime;
    @ManyToOne(targetEntity=Employee.class, fetch=FetchType.EAGER)
    private Employee employee;


}
