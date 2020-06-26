package mypos.management.products;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.math.BigDecimal;

@Entity
public class Ingredient {

    @Id
    @GeneratedValue
    private int id;
    @Column
    private String name;
    @Column
    private String image;
    @Column
    private BigDecimal price;
    @Column
    private Boolean weighted;
    @Column
    private String provider;
    
    public Ingredient() {
        
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
    public String getImage() {
        return image;
    }
    public void setImage(String image) {
        this.image = image;
    }
    public BigDecimal getPrice() {
        return price;
    }
    public void setPrice(BigDecimal price) {
        this.price = price;
    }
    public Boolean getWeighted() {
        return weighted;
    }
    public void setWeighted(Boolean weighted) {
        this.weighted = weighted;
    }
    public String getProvider() {
        return provider;
    }
    public void setProvider(String provider) {
        this.provider = provider;
    }
    
    
    
    

}
