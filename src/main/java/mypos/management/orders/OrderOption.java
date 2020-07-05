package mypos.management.orders;

import javax.persistence.*;

@Entity
@Table(name = "ORDER_OPTIONS")
public class OrderOption {

    @Id
    @Column(name = "ORDER_OPTION_ID", nullable = false)
    @GeneratedValue (strategy = GenerationType.AUTO)
    private Integer id;
    @Column ( nullable = false)
    private String name;
    @Column ( nullable = false)
    private String value;

    public OrderOption(){

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

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
