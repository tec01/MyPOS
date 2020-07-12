package mypos.management.customer;

import javax.persistence.*;

@Entity
@Table(name = "CUSTOMERS")
public class Customer {

    @Id
    @Column(name = "CUSTOMER_ID", nullable = false)
    @GeneratedValue (strategy = GenerationType.AUTO)
    private int id;
    @Column(name = "NAME", nullable = false)
    private String name;
    @Column(name = "PHONE_NUMBER",nullable = false)
    private String phoneNumber;
    @Column(name = "POSTAL_CODE")
    private String postalCode;

    public Customer(){

    }

    public Customer(int id, String name,String postalCode, String phoneNumber) {
        this.id = id;
        this.name = name;
        this.postalCode = postalCode;
        this.phoneNumber = phoneNumber;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
