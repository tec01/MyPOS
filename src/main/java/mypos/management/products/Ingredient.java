package mypos.management.products;

import java.math.BigDecimal;

public class Ingredient {
    
    private Integer id;
    private String name;
    private String image;
    private BigDecimal price;
    private Boolean weighted;
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
