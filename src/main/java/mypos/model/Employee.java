package mypos.model;

import javax.persistence.*;

@Entity
@Table(name = "EMPLOYEES")
public class Employee {

    @Id
    @Column(name = "EMPLOYEE_ID", nullable = false)
    @GeneratedValue (strategy = GenerationType.AUTO)
    private int id;
    @Column(name = "NAME", nullable = false)
    private String name;
    @Column(name = "LAST_NAME")
    private String lastName;
    @Column(name = "ADDRESS")
    private String address;
    @Column(name = "POSTAL_CODE")
    private String postalCode;
    @Column(name = "PHONE_NUMBER")
    private String phoneNumber;

    public Employee(){

    }

    public Employee(int id, String name,
                    String lastName, String address, String postalCode, String phoneNumber) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.address = address;
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

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
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
