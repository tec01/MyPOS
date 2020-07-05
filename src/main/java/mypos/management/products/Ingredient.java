package mypos.management.products;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "INGREDIENTS")
public class Ingredient {

    @Id
    @Column(name = "INGREDIENT_ID", nullable = false)
    @GeneratedValue (strategy = GenerationType.AUTO)
    private int id;
    @Column( name = "NAME", nullable = false)
    private String name;
    @Column(name = "IMG_PATH")
    private String image;
    @Column( name="PRICE", nullable = false, precision = 2, scale = 2 )
    private BigDecimal price;
    @Column( name = "WEIGHTED", nullable = false )
    private Boolean weighted;
    @Column( name = "PROVIDER")
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
