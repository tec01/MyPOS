package mypos.management.orders;

import mypos.management.employees.Employee;

import java.time.LocalDateTime;
import java.util.List;

public class Order {

    private int id;
    private List<OrderItem> items;
    private LocalDateTime dateTime;
    private Employee employee;


}
