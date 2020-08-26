package mypos.model;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "FAMILIES")
public class Family {

    @Id
    @Column(name = "FAMILY_ID", nullable = false)
    @GeneratedValue (strategy = GenerationType.AUTO)
    private Integer id;
    @Column(nullable = false)
    private String name;
    @OneToMany (mappedBy = "family")
    private Set<Product> products;

    public Family(){

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Product> getProducts() {
        return products;
    }

    public void setProducts(Set<Product> products) {
        this.products = products;
    }
}
