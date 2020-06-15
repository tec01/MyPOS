package mypos.management.products;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Set;

import mypos.management.families.Family;


public class Product {

    private Long id;
    
    private LocalDate createdOn;
    private LocalDate modifiedOn;
    private String name;
    private BigDecimal price;
    private String provider;
    private String image;
    private String description;
    private Set<Ingredient> ingredients;
    private Family family;
    private ProductType PRODUCT_TYPE;
    private boolean weighted;
    
    public Product() {
        
    }
    
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public LocalDate getCreatedOn() {
        return createdOn;
    }
    public void setCreatedOn(LocalDate createdOn) {
        this.createdOn = createdOn;
    }
    public LocalDate getModifiedOn() {
        return modifiedOn;
    }
    public void setModifiedOn(LocalDate modifiedOn) {
        this.modifiedOn = modifiedOn;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public BigDecimal getPrice() {
        return price;
    }
    public void setPrice(BigDecimal price) {
        this.price = price;
    }
    public String getImage() {
        return image;
    }
    public void setImage(String image) {
        this.image = image;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public Set<Ingredient> getIngredients() {
        return ingredients;
    }
    public void setIngredients(Set<Ingredient> ingredients) {
        this.ingredients = ingredients;
    }
    public Family getFamily() {
        return family;
    }
    public void setFamily(Family family) {
        this.family = family;
    }
    public ProductType getType() {
        return PRODUCT_TYPE;
    }
    public void setType(ProductType type) {
        this.PRODUCT_TYPE = type;
    }

    public boolean isWeighted() {
        return weighted;
    }

    public void setWeighted(boolean weighted) {
        this.weighted = weighted;
    }

    public String getProvider() {
        return provider;
    }

    public void setProvider(String provider) {
        this.provider = provider;
    }
    
    

    
}
